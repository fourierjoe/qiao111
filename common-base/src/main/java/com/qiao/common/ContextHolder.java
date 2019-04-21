package com.qiao.common;

/**
 * @Description:
 * @Created by ql on 2019/4/20/020 19:09
 * @Version: v1.0
 */
public class ContextHolder {
    private static final ThreadLocal<Map<String, Object>> contextHolder = new ThreadLocal();

    public ContextHolder() {
    }

    public static void setDataSource(ContextHolder.DataSourceContextKey.dataSource) {

    }

    public static void getDataSource() {
        Map<String, Object> holder = getContextHolder();
        holder.pu
    }

    static enum DataSource implements ContextHolder.DataSourceContextKey {
        MSHZ;

        private DataSource() {}
    }

    public interface DataSourceContextKey extends ContextHolder.ContextKey {
    }

    public interface ContextKey {
    }
}
