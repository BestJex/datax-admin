package com.github.thestyleofme.datax.server.domain.entity.writer.rdbmswriter;

import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;


/**
 * <p>
 * DataX Mysql Oracle插件的connection封装
 * </p>
 *
 * @author thestyleofme 2019/04/28 10:34
 */
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WriterConnection {

    /**
     * 需要同步的表，支持同一schema下多张表同时抽取
     */
    @NotEmpty
    private List<String> table;
    /**
     * DataX 会在你提供的 jdbcUrl 后面追加如下属性：
     * yearIsDateType=false&zeroDateTimeBehavior=convertToNull&rewriteBatchedStatements=true
     */
    @NotBlank
    private String jdbcUrl;

}
