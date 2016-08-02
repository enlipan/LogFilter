package com.example.lee.logfilter.logger;

import android.util.Log;

/**
 * Created by Lee on 2016/8/2.
 */
public class SLog {

    public static final int VERBOSE = Log.VERBOSE;
    public static final int DEBUG = Log.DEBUG;
    public static final int INFO = Log.INFO;
    public static final int WARN = Log.WARN;
    public static final int ERROR = Log.ERROR;
    public static final int ASSERT = Log.ASSERT;

    private static String DEFAULT_TAG = "BuildConfig.DEFAULT_TAG";

    private static LoggerDelegate mLoggerHandler = LoggerDelegateImp.getInstance();

    public static void setLoggingDelegate(LoggerDelegate delegate){
        if (delegate == null){
            throw new IllegalArgumentException("LoggerDelegate can not been set Null!");
        }
        mLoggerHandler = delegate;
    }

    public static void setDefaultPrintTag(String tag){
        DEFAULT_TAG = tag;
    }

    public static void setMinLoggerLevel(int level) {
        mLoggerHandler.setMinLoggerLevel(level);
    }

    public static int getMinLoggerLevel() {
        return mLoggerHandler.getMinLoggerLevel();
    }

    public static void setAppTagPrefix(String appTag){
        mLoggerHandler.setAppTag(appTag);
    }

    public static void v(String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(VERBOSE)) {
            mLoggerHandler.v(DEFAULT_TAG, msg);
        }
    }

    public static void v(String tag, String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(VERBOSE)) {
            mLoggerHandler.v(tag, msg);
        }
    }

    public static void v(String tag, String msg, Throwable t) {
        if (mLoggerHandler.isSpecifyLevelLoggable(VERBOSE)) {
            mLoggerHandler.d(tag, msg, t);
        }
    }

    public static void d(String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(DEBUG)) {
            mLoggerHandler.d(DEFAULT_TAG, msg);
        }
    }

    public static void d(String tag, String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(DEBUG)) {
            mLoggerHandler.d(tag, msg);
        }
    }

    public static void d(String tag, String msg, Throwable t) {
        if (mLoggerHandler.isSpecifyLevelLoggable(DEBUG)) {
            mLoggerHandler.i(tag, msg, t);
        }
    }

    public static void i(String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(INFO)) {
            mLoggerHandler.i(DEFAULT_TAG, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(INFO)) {
            mLoggerHandler.i(tag, msg);
        }
    }

    public static void i(String tag, String msg, Throwable t) {
        if (mLoggerHandler.isSpecifyLevelLoggable(INFO)) {
            mLoggerHandler.i(tag, msg, t);
        }
    }

    public static void w(String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(WARN)) {
            mLoggerHandler.w(DEFAULT_TAG, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(WARN)) {
            mLoggerHandler.w(tag, msg);
        }
    }

    public static void w(String tag, String msg, Throwable t) {
        if (mLoggerHandler.isSpecifyLevelLoggable(WARN)) {
            mLoggerHandler.w(tag, msg, t);
        }
    }

    public static void e(String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(ERROR)) {
            mLoggerHandler.e(DEFAULT_TAG, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (mLoggerHandler.isSpecifyLevelLoggable(ERROR)) {
            mLoggerHandler.e(tag, msg);
        }
    }

    public static void e(String tag, String msg, Throwable t) {
        if (mLoggerHandler.isSpecifyLevelLoggable(ERROR)) {
            mLoggerHandler.e(tag, msg, t);
        }
    }

}
