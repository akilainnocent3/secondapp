package com.startapp.simple.bloomfilter.compression;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class NoCompression implements TokenCompression {
    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String compress(String str) {
        return str;
    }

    @Override // com.startapp.simple.bloomfilter.compression.TokenCompression
    public String decompress(String str) {
        return str;
    }
}
