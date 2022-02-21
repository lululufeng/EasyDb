package com.luxf.easydb;


import com.google.common.base.Preconditions;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 数据驱动类
 * @author luxf
 * @createTime 2022/02/21 21:00:00
 */

public class DbRunner {

    private final QueryRunner queryRunner;

    public DbRunner(final DataSource dataSource) {
        Preconditions.checkNotNull(dataSource, "dataSource can not be null");
        this.queryRunner = new QueryRunner(dataSource);
    }

    public void truncateTable(final String tableName) throws SQLException {
        try {
            this.queryRunner.update("truncate table " + tableName);
        } catch (SQLException e) {
            throw e;
        }
    }
}
