package com.luxf.easydb;

import com.google.common.base.Preconditions;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * @author luxf
 * @createTime 2022/02/21 20:51:00
 */

public class EasyDb {

    private DbRunner dbRunner;

    public EasyDb(DataSource dataSource) {
        Preconditions.checkNotNull(dataSource, "dataSource can not be null");
        this.dbRunner = new DbRunner(dataSource);
    }

    /**
     * 清空表
     * @param taleName 表名
     * @throws SQLException sql异常
     */
    public void truncateTable(String taleName) throws SQLException {
        dbRunner.truncateTable(taleName);
    }
}
