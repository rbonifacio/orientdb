/* Generated By:JJTree: Do not edit this line. OFirstLevelExpression.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.command.OCommandContext;

public class OFirstLevelExpression extends OMathExpression {
  public OFirstLevelExpression(int id) {
    super(id);
  }

  public OFirstLevelExpression(OrientSql p, int id) {
    super(p, id);
  }

  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override
  protected boolean supportsBasicCalculation() {
    return super.supportsBasicCalculation();
  }

  public boolean isBaseIdentifier() {
    if (value instanceof OIdentifier) {
      return true;
    }
    return false;
  }

  @Override public boolean isAggregate() {
    if(value instanceof OFunctionCall){
      return ((OFunctionCall)value).isAggregate();
    }
    return super.isAggregate();
  }

  public boolean isFiltering() {
    if(value instanceof OFunctionCall){
      return ((OFunctionCall)value).isFiltering();
    }
    return super.isFiltering();
  }


  public Object getAggregateResult(OCommandContext ctx) {
    if(value instanceof OFunctionCall){
      return ((OFunctionCall)value).getAggregateResult(ctx);
    }
    return null;
  }

  public String getDefaultAlias() {
    if (value instanceof OIdentifier) {
      return value.toString();
    }
    if(value instanceof OFunctionCall){
      return ((OFunctionCall)value).getDefaultAlias();
    }
    return super.getDefaultAlias();
  }
}
/* JavaCC - OriginalChecksum=30dc1016b686d4841bbd57d6e6c0bfbd (do not edit this line) */
