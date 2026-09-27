package com.startapp.simple.bloomfilter.compression;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class ToUrlStringReplacer implements StringReplacer {
    private static final String DIEZ = "#";
    private static final String EQUALS = "=";
    private static final String PLUS = "+";
    private static final String PLUS_SAFE_REGEX = "\\+";
    private static final String SLASH = "/";
    private static final String STAR = "*";
    private static final String STAR_SAFE_REGEX = "\\*";
    private static final String UNDERSCORE = "_";
    private final Pattern patternPlus = Pattern.compile(PLUS_SAFE_REGEX);
    private final Pattern patternSlash = Pattern.compile("/");
    private final Pattern patternEquals = Pattern.compile("=");
    private final Pattern patternUnderscore = Pattern.compile("_");
    private final Pattern patternStartSafeRegex = Pattern.compile(STAR_SAFE_REGEX);
    private final Pattern patternDiez = Pattern.compile(DIEZ);

    @Override // com.startapp.simple.bloomfilter.compression.StringReplacer
    public String replaceFromUrl(String str) {
        return this.patternDiez.matcher(this.patternStartSafeRegex.matcher(this.patternUnderscore.matcher(str).replaceAll("+")).replaceAll("/")).replaceAll("=");
    }

    @Override // com.startapp.simple.bloomfilter.compression.StringReplacer
    public String replaceToUrl(String str) {
        return this.patternEquals.matcher(this.patternSlash.matcher(this.patternPlus.matcher(str).replaceAll("_")).replaceAll("*")).replaceAll(DIEZ);
    }
}
