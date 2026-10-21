package br.com.unipds;

import io.soabase.recordbuilder.core.RecordBuilder;

import java.nio.file.Path;

@RecordBuilder
public record Capitulo(String titulo, Markdown markdown, String html) {

}
