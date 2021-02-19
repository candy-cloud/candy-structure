package com.candy.structure.metadata.service;

import com.candy.structure.metadata.utils.Result;

public interface StructureService {

    public Result getCatalogs();

    public Result getTables(String catalog, String schemaPattern, String tableNamePattern, String types[]);

    public Result getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern);

    public Result getDiff(String sourceCataLog,String targetCataLog);

}
