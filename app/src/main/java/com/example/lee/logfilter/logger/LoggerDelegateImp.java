package com.example.lee.logfilter.logger;

import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Lee on 2016/8/2.
 */
public class LoggerDelegateImp implements LoggerDelegate {

    private static final LoggerDelegateImp S_INSTANCE = new LoggerDelegateImp();

    private int mMiniLoggingLevel = Log.VERBOSE;
    private String mAppTag = "unKnownTag";

    public static LoggerDelegateImp getInstance() {
        return S_INSTANCE;
    }

    private LoggerDelegateImp() {
    }

    @Override
    public void setMinLoggerLevel(int level) {
        mMiniLoggingLevel = level;
    }

    @Override
    public int getMinLoggerLevel() {
        return mMiniLoggingLevel;
    }

    @Override
    public void setAppTag(String appTag){
        mAppTag = appTag;
    }

    @Override
    public boolean isSpecifyLevelLoggable(int level) {
        return mMiniLoggingLevel <= level;
    }

    @Override
    public void v(String tag, String msg) {
        println(Log.VERBOSE, tag, msg);
    }

    @Override
    public void v(String tag, String msg, Throwable t) {
        println(Log.VERBOSE, tag, getMixMsg(msg, t));
    }

    @Override
    public void d(String tag, String msg) {
        println(Log.DEBUG, tag, msg);
    }

    @Override
    public void d(String tag, String msg, Throwable t) {
        println(Log.DEBUG, tag, getMixMsg(msg, t));

    }

    @Override
    public void i(String tag, String msg) {
        println(Log.INFO, tag, msg);
    }

    @Override
    public void i(String tag, String msg, Throwable t) {
        println(Log.INFO, tag, getMixMsg(msg, t));
    }

    @Override
    public void w(String tag, String msg) {
        println(Log.WARN, tag, msg);
    }

    @Override
    public void w(String tag, String msg, Throwable t) {
        println(Log.WARN, tag, getMixMsg(msg, t));
    }

    @Override
    public void e(String tag, String msg) {
        println(Log.ERROR, tag, msg);
    }

    @Override
    public void e(String tag, String msg, Throwable t) {
        println(Log.ERROR, tag, getMixMsg(msg, t));
    }

    private String getMixMsg(String msg, Throwable t) {
        return msg + " \n" + "Throwable >>>>>>  " + t.getMessage();
    }

    private void println(int priority, String tag, String msg) {
        Log.println(priority, prefixTag(tag), msg);
    }

    private String prefixTag(String tag) {
        return TextUtils.isEmpty(mAppTag) ? tag : mAppTag + "->" + tag;
    }
}
