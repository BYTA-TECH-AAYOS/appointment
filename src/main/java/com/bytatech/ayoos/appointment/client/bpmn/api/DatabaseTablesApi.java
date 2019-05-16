/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.0.0-SNAPSHOT).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.bytatech.ayoos.appointment.client.bpmn.api;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import com.bytatech.ayoos.appointment.client.bpmn.model.DataResponse;
import com.bytatech.ayoos.appointment.client.bpmn.model.TableMetaData;
import com.bytatech.ayoos.appointment.client.bpmn.model.TableResponse;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2018-11-13T13:06:04.659+05:30[Asia/Kolkata]")

@Api(value = "DatabaseTables", description = "the DatabaseTables API")
public interface DatabaseTablesApi {

    @ApiOperation(value = "Get a single table", nickname = "getTable", notes = "", response = TableResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Database tables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the table exists and the table count is returned.", response = TableResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested table does not exist.") })
    @RequestMapping(value = "/management/tables/{tableName}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<TableResponse> getTable(@ApiParam(value = "The name of the table to get.",required=true) @PathVariable("tableName") String tableName);


    @ApiOperation(value = "Get row data for a single table", nickname = "getTableData", notes = "", response = DataResponse.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Database tables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the table exists and the table row data is returned", response = DataResponse.class),
        @ApiResponse(code = 404, message = "Indicates the requested table does not exist.") })
    @RequestMapping(value = "/management/tables/{tableName}/data",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DataResponse> getTableData(@ApiParam(value = "The name of the table to get.",required=true) @PathVariable("tableName") String tableName,@ApiParam(value = "Index of the first row to fetch. Defaults to 0.") @Valid @RequestParam(value = "start", required = false) Integer start,@ApiParam(value = "Number of rows to fetch, starting from start. Defaults to 10.") @Valid @RequestParam(value = "size", required = false) Integer size,@ApiParam(value = "Name of the column to sort the resulting rows on, ascending.") @Valid @RequestParam(value = "orderAscendingColumn", required = false) String orderAscendingColumn,@ApiParam(value = "Name of the column to sort the resulting rows on, descending.") @Valid @RequestParam(value = "orderDescendingColumn", required = false) String orderDescendingColumn);


    @ApiOperation(value = "Get column info for a single table", nickname = "getTableMetaData", notes = "", response = TableMetaData.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Database tables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the table exists and the table column info is returned.", response = TableMetaData.class),
        @ApiResponse(code = 404, message = "Indicates the requested table does not exist.") })
    @RequestMapping(value = "/management/tables/{tableName}/columns",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<TableMetaData> getTableMetaData(@ApiParam(value = "The name of the table to get.",required=true) @PathVariable("tableName") String tableName);


    @ApiOperation(value = " List of tables", nickname = "getTables", notes = "", response = TableResponse.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "Database tables", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Indicates the request was successful.", response = TableResponse.class, responseContainer = "List") })
    @RequestMapping(value = "/management/tables",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<TableResponse>> getTables();

}
