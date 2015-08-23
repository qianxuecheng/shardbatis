package com.github.shardbatis.visitor;

import com.alibaba.druid.sql.ast.*;
import com.alibaba.druid.sql.ast.expr.*;
import com.alibaba.druid.sql.ast.statement.*;
import com.alibaba.druid.sql.dialect.mysql.ast.*;
import com.alibaba.druid.sql.dialect.mysql.ast.expr.*;
import com.alibaba.druid.sql.dialect.mysql.ast.statement.*;
import com.alibaba.druid.sql.dialect.mysql.visitor.MySqlASTVisitor;
import com.github.shardbatis.builder.ShardbatisConfig;
import com.github.shardbatis.strategy.ShardStrategy;

/**
 * Created by qianxuecheng on 15/8/21.
 */
public class TableNameModifier implements MySqlASTVisitor {


    private Object params;
    private String mapperId;

    public TableNameModifier(Object params, String mapperId) {
        this.params = params;
        this.mapperId = mapperId;
    }
    @Override
    public boolean visit(MySqlSelectQueryBlock.Limit x) {
        return false;
    }

    @Override
    public void endVisit(MySqlSelectQueryBlock.Limit x) {

    }

    @Override
    public boolean visit(MySqlTableIndex x) {
        return false;
    }

    @Override
    public void endVisit(MySqlTableIndex x) {

    }

    @Override
    public boolean visit(MySqlKey x) {
        return false;
    }

    @Override
    public void endVisit(MySqlKey x) {

    }

    @Override
    public boolean visit(MySqlPrimaryKey x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPrimaryKey x) {

    }

    @Override
    public boolean visit(MySqlUnique x) {
        return false;
    }

    @Override
    public void endVisit(MySqlUnique x) {

    }

    @Override
    public boolean visit(MysqlForeignKey x) {
        return false;
    }

    @Override
    public void endVisit(MysqlForeignKey x) {

    }

    @Override
    public void endVisit(MySqlIntervalExpr x) {

    }

    @Override
    public boolean visit(MySqlIntervalExpr x) {
        return false;
    }

    @Override
    public void endVisit(MySqlExtractExpr x) {

    }

    @Override
    public boolean visit(MySqlExtractExpr x) {
        return false;
    }

    @Override
    public void endVisit(MySqlMatchAgainstExpr x) {

    }

    @Override
    public boolean visit(MySqlMatchAgainstExpr x) {
        return false;
    }

    @Override
    public void endVisit(MySqlBinaryExpr x) {

    }

    @Override
    public boolean visit(MySqlBinaryExpr x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPrepareStatement x) {

    }

    @Override
    public boolean visit(MySqlPrepareStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlExecuteStatement x) {

    }

    @Override
    public boolean visit(MySqlExecuteStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlDeleteStatement x) {

    }

    @Override
    public boolean visit(MySqlDeleteStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlInsertStatement x) {

    }

    @Override
    public boolean visit(MySqlInsertStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlLoadDataInFileStatement x) {

    }

    @Override
    public boolean visit(MySqlLoadDataInFileStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlLoadXmlStatement x) {

    }

    @Override
    public boolean visit(MySqlLoadXmlStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlReplaceStatement x) {

    }

    @Override
    public boolean visit(MySqlReplaceStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlSelectGroupBy x) {

    }

    @Override
    public boolean visit(MySqlSelectGroupBy x) {
        return false;
    }

    @Override
    public void endVisit(MySqlStartTransactionStatement x) {

    }

    @Override
    public boolean visit(MySqlStartTransactionStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlCommitStatement x) {

    }

    @Override
    public boolean visit(MySqlCommitStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlRollbackStatement x) {

    }

    @Override
    public boolean visit(MySqlRollbackStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowColumnsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowColumnsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowTablesStatement x) {

    }

    @Override
    public boolean visit(MySqlShowTablesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowDatabasesStatement x) {

    }

    @Override
    public boolean visit(MySqlShowDatabasesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowWarningsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowWarningsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowStatusStatement x) {

    }

    @Override
    public boolean visit(MySqlShowStatusStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowAuthorsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowAuthorsStatement x) {
        return false;
    }

    @Override
    public void endVisit(CobarShowStatus x) {

    }

    @Override
    public boolean visit(CobarShowStatus x) {
        return false;
    }

    @Override
    public void endVisit(MySqlKillStatement x) {

    }

    @Override
    public boolean visit(MySqlKillStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlBinlogStatement x) {

    }

    @Override
    public boolean visit(MySqlBinlogStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlResetStatement x) {

    }

    @Override
    public boolean visit(MySqlResetStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlCreateUserStatement x) {

    }

    @Override
    public boolean visit(MySqlCreateUserStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlCreateUserStatement.UserSpecification x) {

    }

    @Override
    public boolean visit(MySqlCreateUserStatement.UserSpecification x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPartitionByKey x) {

    }

    @Override
    public boolean visit(MySqlPartitionByKey x) {
        return false;
    }

    @Override
    public boolean visit(MySqlSelectQueryBlock x) {
        x.getFrom().accept(this);
        return false;
    }

    @Override
    public void endVisit(MySqlSelectQueryBlock x) {

    }

    @Override
    public boolean visit(MySqlOutFileExpr x) {
        return false;
    }

    @Override
    public void endVisit(MySqlOutFileExpr x) {

    }

    @Override
    public boolean visit(MySqlDescribeStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlDescribeStatement x) {

    }

    @Override
    public boolean visit(MySqlUpdateStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlUpdateStatement x) {

    }

    @Override
    public boolean visit(MySqlSetTransactionIsolationLevelStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlSetTransactionIsolationLevelStatement x) {

    }

    @Override
    public boolean visit(MySqlSetNamesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlSetNamesStatement x) {

    }

    @Override
    public boolean visit(MySqlSetCharSetStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlSetCharSetStatement x) {

    }

    @Override
    public boolean visit(MySqlShowBinaryLogsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowBinaryLogsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowMasterLogsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowMasterLogsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCharacterSetStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCharacterSetStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCollationStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCollationStatement x) {

    }

    @Override
    public boolean visit(MySqlShowBinLogEventsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowBinLogEventsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowContributorsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowContributorsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCreateDatabaseStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCreateDatabaseStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCreateEventStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCreateEventStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCreateFunctionStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCreateFunctionStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCreateProcedureStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCreateProcedureStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCreateTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCreateTableStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCreateTriggerStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCreateTriggerStatement x) {

    }

    @Override
    public boolean visit(MySqlShowCreateViewStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowCreateViewStatement x) {

    }

    @Override
    public boolean visit(MySqlShowEngineStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowEngineStatement x) {

    }

    @Override
    public boolean visit(MySqlShowEnginesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowEnginesStatement x) {

    }

    @Override
    public boolean visit(MySqlShowErrorsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowErrorsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowEventsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowEventsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowFunctionCodeStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowFunctionCodeStatement x) {

    }

    @Override
    public boolean visit(MySqlShowFunctionStatusStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowFunctionStatusStatement x) {

    }

    @Override
    public boolean visit(MySqlShowGrantsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowGrantsStatement x) {

    }

    @Override
    public boolean visit(MySqlUserName x) {
        return false;
    }

    @Override
    public void endVisit(MySqlUserName x) {

    }

    @Override
    public boolean visit(MySqlShowIndexesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowIndexesStatement x) {

    }

    @Override
    public boolean visit(MySqlShowKeysStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowKeysStatement x) {

    }

    @Override
    public boolean visit(MySqlShowMasterStatusStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowMasterStatusStatement x) {

    }

    @Override
    public boolean visit(MySqlShowOpenTablesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowOpenTablesStatement x) {

    }

    @Override
    public boolean visit(MySqlShowPluginsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowPluginsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowPrivilegesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowPrivilegesStatement x) {

    }

    @Override
    public boolean visit(MySqlShowProcedureCodeStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowProcedureCodeStatement x) {

    }

    @Override
    public boolean visit(MySqlShowProcedureStatusStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowProcedureStatusStatement x) {

    }

    @Override
    public boolean visit(MySqlShowProcessListStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowProcessListStatement x) {

    }

    @Override
    public boolean visit(MySqlShowProfileStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowProfileStatement x) {

    }

    @Override
    public boolean visit(MySqlShowProfilesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowProfilesStatement x) {

    }

    @Override
    public boolean visit(MySqlShowRelayLogEventsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowRelayLogEventsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowSlaveHostsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowSlaveHostsStatement x) {

    }

    @Override
    public boolean visit(MySqlShowSlaveStatusStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowSlaveStatusStatement x) {

    }

    @Override
    public boolean visit(MySqlShowTableStatusStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowTableStatusStatement x) {

    }

    @Override
    public boolean visit(MySqlShowTriggersStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowTriggersStatement x) {

    }

    @Override
    public boolean visit(MySqlShowVariantsStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlShowVariantsStatement x) {

    }

    @Override
    public boolean visit(MySqlAlterTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableStatement x) {

    }

    @Override
    public boolean visit(MySqlAlterTableAddColumn x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableAddColumn x) {

    }

    @Override
    public boolean visit(MySqlCreateIndexStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlCreateIndexStatement x) {

    }

    @Override
    public boolean visit(MySqlRenameTableStatement.Item x) {
        return false;
    }

    @Override
    public void endVisit(MySqlRenameTableStatement.Item x) {

    }

    @Override
    public boolean visit(MySqlRenameTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlRenameTableStatement x) {

    }

    @Override
    public boolean visit(MySqlUnionQuery x) {
        return false;
    }

    @Override
    public void endVisit(MySqlUnionQuery x) {

    }

    @Override
    public boolean visit(MySqlUseIndexHint x) {
        return false;
    }

    @Override
    public void endVisit(MySqlUseIndexHint x) {

    }

    @Override
    public boolean visit(MySqlIgnoreIndexHint x) {
        return false;
    }

    @Override
    public void endVisit(MySqlIgnoreIndexHint x) {

    }

    @Override
    public boolean visit(MySqlLockTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlLockTableStatement x) {

    }

    @Override
    public boolean visit(MySqlUnlockTablesStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlUnlockTablesStatement x) {

    }

    @Override
    public boolean visit(MySqlForceIndexHint x) {
        return false;
    }

    @Override
    public void endVisit(MySqlForceIndexHint x) {

    }

    @Override
    public boolean visit(MySqlAlterTableChangeColumn x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableChangeColumn x) {

    }

    @Override
    public boolean visit(MySqlAlterTableCharacter x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableCharacter x) {

    }

    @Override
    public boolean visit(MySqlAlterTableOption x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableOption x) {

    }

    @Override
    public boolean visit(MySqlCreateTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlCreateTableStatement x) {

    }

    @Override
    public boolean visit(MySqlHelpStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlHelpStatement x) {

    }

    @Override
    public boolean visit(MySqlCharExpr x) {
        return false;
    }

    @Override
    public void endVisit(MySqlCharExpr x) {

    }

    @Override
    public boolean visit(MySqlAlterTableModifyColumn x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableModifyColumn x) {

    }

    @Override
    public boolean visit(MySqlAlterTableDiscardTablespace x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableDiscardTablespace x) {

    }

    @Override
    public boolean visit(MySqlAlterTableImportTablespace x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterTableImportTablespace x) {

    }

    @Override
    public boolean visit(MySqlCreateTableStatement.TableSpaceOption x) {
        return false;
    }

    @Override
    public void endVisit(MySqlCreateTableStatement.TableSpaceOption x) {

    }

    @Override
    public boolean visit(MySqlPartitionByHash x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPartitionByHash x) {

    }

    @Override
    public boolean visit(MySqlPartitionByRange x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPartitionByRange x) {

    }

    @Override
    public boolean visit(MySqlPartitionByList x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPartitionByList x) {

    }

    @Override
    public boolean visit(MySqlPartitioningDef x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPartitioningDef x) {

    }

    @Override
    public boolean visit(MySqlPartitioningDef.LessThanValues x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPartitioningDef.LessThanValues x) {

    }

    @Override
    public boolean visit(MySqlPartitioningDef.InValues x) {
        return false;
    }

    @Override
    public void endVisit(MySqlPartitioningDef.InValues x) {

    }

    @Override
    public boolean visit(MySqlAnalyzeStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAnalyzeStatement x) {

    }

    @Override
    public boolean visit(MySqlAlterUserStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlAlterUserStatement x) {

    }

    @Override
    public boolean visit(MySqlOptimizeStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlOptimizeStatement x) {

    }

    @Override
    public boolean visit(MySqlSetPasswordStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlSetPasswordStatement x) {

    }

    @Override
    public boolean visit(MySqlHintStatement x) {
        return false;
    }

    @Override
    public void endVisit(MySqlHintStatement x) {

    }

    @Override
    public void endVisit(SQLAllColumnExpr x) {

    }

    @Override
    public void endVisit(SQLBetweenExpr x) {

    }

    @Override
    public void endVisit(SQLBinaryOpExpr x) {

    }

    @Override
    public void endVisit(SQLCaseExpr x) {

    }

    @Override
    public void endVisit(SQLCaseExpr.Item x) {

    }

    @Override
    public void endVisit(SQLCharExpr x) {

    }

    @Override
    public void endVisit(SQLIdentifierExpr x) {

    }

    @Override
    public void endVisit(SQLInListExpr x) {

    }

    @Override
    public void endVisit(SQLIntegerExpr x) {

    }

    @Override
    public void endVisit(SQLExistsExpr x) {

    }

    @Override
    public void endVisit(SQLNCharExpr x) {

    }

    @Override
    public void endVisit(SQLNotExpr x) {

    }

    @Override
    public void endVisit(SQLNullExpr x) {

    }

    @Override
    public void endVisit(SQLNumberExpr x) {

    }

    @Override
    public void endVisit(SQLPropertyExpr x) {

    }

    @Override
    public void endVisit(SQLSelectGroupByClause x) {

    }

    @Override
    public void endVisit(SQLSelectItem x) {

    }

    @Override
    public void endVisit(SQLSelectStatement selectStatement) {

    }

    @Override
    public void postVisit(SQLObject astNode) {

    }

    @Override
    public void preVisit(SQLObject astNode) {

    }

    @Override
    public boolean visit(SQLAllColumnExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLBetweenExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLBinaryOpExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLCaseExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLCaseExpr.Item x) {
        return false;
    }

    @Override
    public boolean visit(SQLCastExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLCharExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLExistsExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLIdentifierExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLInListExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLIntegerExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLNCharExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLNotExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLNullExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLNumberExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLPropertyExpr x) {
        return false;
    }

    @Override
    public boolean visit(SQLSelectGroupByClause x) {
        return false;
    }

    @Override
    public boolean visit(SQLSelectItem x) {
        return false;
    }

    @Override
    public void endVisit(SQLCastExpr x) {

    }

    @Override
    public boolean visit(SQLSelectStatement astNode) {
        astNode.getSelect().accept(this);
        return false;
    }

    @Override
    public void endVisit(SQLAggregateExpr astNode) {

    }

    @Override
    public boolean visit(SQLAggregateExpr astNode) {
        return false;
    }

    @Override
    public boolean visit(SQLVariantRefExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLVariantRefExpr x) {

    }

    @Override
    public boolean visit(SQLQueryExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLQueryExpr x) {

    }

    @Override
    public boolean visit(SQLUnaryExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLUnaryExpr x) {

    }

    @Override
    public boolean visit(SQLHexExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLHexExpr x) {

    }

    @Override
    public boolean visit(SQLSelect x) {
        x.getQuery().accept(this);
        return false;
    }

    @Override
    public void endVisit(SQLSelect select) {

    }

    @Override
    public boolean visit(SQLSelectQueryBlock x) {
        return false;
    }

    @Override
    public void endVisit(SQLSelectQueryBlock x) {

    }

    @Override
    public boolean visit(SQLExprTableSource x) {
        x.getExpr().accept(this);
        return false;
    }

    @Override
    public void endVisit(SQLExprTableSource x) {

    }

    @Override
    public boolean visit(SQLOrderBy x) {
        return false;
    }

    @Override
    public void endVisit(SQLOrderBy x) {

    }

    @Override
    public boolean visit(SQLSelectOrderByItem x) {
        return false;
    }

    @Override
    public void endVisit(SQLSelectOrderByItem x) {

    }

    @Override
    public boolean visit(SQLDropTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropTableStatement x) {

    }

    @Override
    public boolean visit(SQLCreateTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLCreateTableStatement x) {

    }

    @Override
    public boolean visit(SQLColumnDefinition x) {
        return false;
    }

    @Override
    public void endVisit(SQLColumnDefinition x) {

    }

    @Override
    public boolean visit(SQLDataType x) {
        return false;
    }

    @Override
    public void endVisit(SQLDataType x) {

    }

    @Override
    public boolean visit(SQLCharacterDataType x) {
        return false;
    }

    @Override
    public void endVisit(SQLCharacterDataType x) {

    }

    @Override
    public boolean visit(SQLDeleteStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDeleteStatement x) {

    }

    @Override
    public boolean visit(SQLCurrentOfCursorExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLCurrentOfCursorExpr x) {

    }

    @Override
    public boolean visit(SQLInsertStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLInsertStatement x) {

    }

    @Override
    public boolean visit(SQLInsertStatement.ValuesClause x) {
        return false;
    }

    @Override
    public void endVisit(SQLInsertStatement.ValuesClause x) {

    }

    @Override
    public boolean visit(SQLUpdateSetItem x) {
        return false;
    }

    @Override
    public void endVisit(SQLUpdateSetItem x) {

    }

    @Override
    public boolean visit(SQLUpdateStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLUpdateStatement x) {

    }

    @Override
    public boolean visit(SQLCreateViewStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLCreateViewStatement x) {

    }

    @Override
    public boolean visit(NotNullConstraint x) {
        return false;
    }

    @Override
    public void endVisit(NotNullConstraint x) {

    }

    @Override
    public void endVisit(SQLMethodInvokeExpr x) {

    }

    @Override
    public boolean visit(SQLMethodInvokeExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLUnionQuery x) {

    }

    @Override
    public boolean visit(SQLUnionQuery x) {
        return false;
    }

    @Override
    public void endVisit(SQLSetStatement x) {

    }

    @Override
    public boolean visit(SQLSetStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLAssignItem x) {

    }

    @Override
    public boolean visit(SQLAssignItem x) {
        return false;
    }

    @Override
    public void endVisit(SQLCallStatement x) {

    }

    @Override
    public boolean visit(SQLCallStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLJoinTableSource x) {

    }

    @Override
    public boolean visit(SQLJoinTableSource x) {
        x.getLeft().accept(this);
        x.getRight().accept(this);
        return false;
    }

    @Override
    public void endVisit(SQLSomeExpr x) {

    }

    @Override
    public boolean visit(SQLSomeExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLAnyExpr x) {

    }

    @Override
    public boolean visit(SQLAnyExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLAllExpr x) {

    }

    @Override
    public boolean visit(SQLAllExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLInSubQueryExpr x) {

    }

    @Override
    public boolean visit(SQLInSubQueryExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLListExpr x) {

    }

    @Override
    public boolean visit(SQLListExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLSubqueryTableSource x) {

    }

    @Override
    public boolean visit(SQLSubqueryTableSource x) {
        return false;
    }

    @Override
    public void endVisit(SQLTruncateStatement x) {

    }

    @Override
    public boolean visit(SQLTruncateStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDefaultExpr x) {

    }

    @Override
    public boolean visit(SQLDefaultExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLCommentStatement x) {

    }

    @Override
    public boolean visit(SQLCommentStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLUseStatement x) {

    }

    @Override
    public boolean visit(SQLUseStatement x) {
        return false;
    }

    @Override
    public boolean visit(SQLAlterTableAddColumn x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableAddColumn x) {

    }

    @Override
    public boolean visit(SQLAlterTableDropColumnItem x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableDropColumnItem x) {

    }

    @Override
    public boolean visit(SQLAlterTableDropIndex x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableDropIndex x) {

    }

    @Override
    public boolean visit(SQLDropIndexStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropIndexStatement x) {

    }

    @Override
    public boolean visit(SQLDropViewStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropViewStatement x) {

    }

    @Override
    public boolean visit(SQLSavePointStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLSavePointStatement x) {

    }

    @Override
    public boolean visit(SQLRollbackStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLRollbackStatement x) {

    }

    @Override
    public boolean visit(SQLReleaseSavePointStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLReleaseSavePointStatement x) {

    }

    @Override
    public void endVisit(SQLCommentHint x) {

    }

    @Override
    public boolean visit(SQLCommentHint x) {
        return false;
    }

    @Override
    public void endVisit(SQLCreateDatabaseStatement x) {

    }

    @Override
    public boolean visit(SQLCreateDatabaseStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLOver x) {

    }

    @Override
    public boolean visit(SQLOver x) {
        return false;
    }

    @Override
    public void endVisit(SQLColumnPrimaryKey x) {

    }

    @Override
    public boolean visit(SQLColumnPrimaryKey x) {
        return false;
    }

    @Override
    public boolean visit(SQLColumnUniqueKey x) {
        return false;
    }

    @Override
    public void endVisit(SQLColumnUniqueKey x) {

    }

    @Override
    public void endVisit(SQLWithSubqueryClause x) {

    }

    @Override
    public boolean visit(SQLWithSubqueryClause x) {
        return false;
    }

    @Override
    public void endVisit(SQLWithSubqueryClause.Entry x) {

    }

    @Override
    public boolean visit(SQLWithSubqueryClause.Entry x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableAlterColumn x) {

    }

    @Override
    public boolean visit(SQLAlterTableAlterColumn x) {
        return false;
    }

    @Override
    public boolean visit(SQLCheck x) {
        return false;
    }

    @Override
    public void endVisit(SQLCheck x) {

    }

    @Override
    public boolean visit(SQLAlterTableDropForeignKey x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableDropForeignKey x) {

    }

    @Override
    public boolean visit(SQLAlterTableDropPrimaryKey x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableDropPrimaryKey x) {

    }

    @Override
    public boolean visit(SQLAlterTableDisableKeys x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableDisableKeys x) {

    }

    @Override
    public boolean visit(SQLAlterTableEnableKeys x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableEnableKeys x) {

    }

    @Override
    public boolean visit(SQLAlterTableStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableStatement x) {

    }

    @Override
    public boolean visit(SQLAlterTableDisableConstraint x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableDisableConstraint x) {

    }

    @Override
    public boolean visit(SQLAlterTableEnableConstraint x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableEnableConstraint x) {

    }

    @Override
    public boolean visit(SQLColumnCheck x) {
        return false;
    }

    @Override
    public void endVisit(SQLColumnCheck x) {

    }

    @Override
    public boolean visit(SQLExprHint x) {
        return false;
    }

    @Override
    public void endVisit(SQLExprHint x) {

    }

    @Override
    public boolean visit(SQLAlterTableDropConstraint x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableDropConstraint x) {

    }

    @Override
    public boolean visit(SQLUnique x) {
        return false;
    }

    @Override
    public void endVisit(SQLUnique x) {

    }

    @Override
    public boolean visit(SQLPrimaryKeyImpl x) {
        return false;
    }

    @Override
    public void endVisit(SQLPrimaryKeyImpl x) {

    }

    @Override
    public boolean visit(SQLCreateIndexStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLCreateIndexStatement x) {

    }

    @Override
    public boolean visit(SQLAlterTableRenameColumn x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableRenameColumn x) {

    }

    @Override
    public boolean visit(SQLColumnReference x) {
        return false;
    }

    @Override
    public void endVisit(SQLColumnReference x) {

    }

    @Override
    public boolean visit(SQLForeignKeyImpl x) {
        return false;
    }

    @Override
    public void endVisit(SQLForeignKeyImpl x) {

    }

    @Override
    public boolean visit(SQLDropSequenceStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropSequenceStatement x) {

    }

    @Override
    public boolean visit(SQLDropTriggerStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropTriggerStatement x) {

    }

    @Override
    public void endVisit(SQLDropUserStatement x) {

    }

    @Override
    public boolean visit(SQLDropUserStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLExplainStatement x) {

    }

    @Override
    public boolean visit(SQLExplainStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLGrantStatement x) {

    }

    @Override
    public boolean visit(SQLGrantStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropDatabaseStatement x) {

    }

    @Override
    public boolean visit(SQLDropDatabaseStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableAddIndex x) {

    }

    @Override
    public boolean visit(SQLAlterTableAddIndex x) {
        return false;
    }

    @Override
    public void endVisit(SQLAlterTableAddConstraint x) {

    }

    @Override
    public boolean visit(SQLAlterTableAddConstraint x) {
        return false;
    }

    @Override
    public void endVisit(SQLCreateTriggerStatement x) {

    }

    @Override
    public boolean visit(SQLCreateTriggerStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropFunctionStatement x) {

    }

    @Override
    public boolean visit(SQLDropFunctionStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropTableSpaceStatement x) {

    }

    @Override
    public boolean visit(SQLDropTableSpaceStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLDropProcedureStatement x) {

    }

    @Override
    public boolean visit(SQLDropProcedureStatement x) {
        return false;
    }

    @Override
    public void endVisit(SQLBooleanExpr x) {

    }

    @Override
    public boolean visit(SQLBooleanExpr x) {
        return false;
    }

    @Override
    public void endVisit(SQLUnionQueryTableSource x) {

    }

    @Override
    public boolean visit(SQLUnionQueryTableSource x) {
        return false;
    }
}
