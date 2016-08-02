package com.example.lee.logfilter.logger;

/**
 * Created by Lee on 2016/8/2.
 */
public interface LoggerDelegate {


    void setMinLoggerLevel(int level);


    int getMinLoggerLevel();

    void setAppTag(String appTag);

    boolean isSpecifyLevelLoggable(int level);

    void v(String tag,String msg);

    void v(String tag,String msg,Throwable t);

    void d(String tag,String msg);

    void d(String tag,String msg,Throwable t);

    void i(String tag,String msg);

    void i(String tag,String msg,Throwable t);

    void w(String tag,String msg);

    void w(String tag,String msg,Throwable t);

    void e(String tag,String msg);

    void e(String tag,String msg,Throwable t);

}
