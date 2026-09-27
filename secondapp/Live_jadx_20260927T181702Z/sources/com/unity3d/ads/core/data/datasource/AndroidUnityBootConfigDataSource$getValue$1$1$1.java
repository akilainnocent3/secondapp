package com.unity3d.ads.core.data.datasource;

import cv.k0;
import dr.w2;
import ds.l;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class AndroidUnityBootConfigDataSource$getValue$1$1$1 extends o0 implements l<String, w2> {
    final /* synthetic */ String $prefix;
    final /* synthetic */ l1.h<String> $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidUnityBootConfigDataSource$getValue$1$1$1(String str, l1.h<String> hVar) {
        super(1);
        this.$prefix = str;
        this.$value = hVar;
    }

    @Override // ds.l
    public /* bridge */ /* synthetic */ w2 invoke(String str) {
        invoke2(str);
        return w2.f79517a;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [T, java.lang.Object, java.lang.String] */
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(@oy.l String line) {
        m0.p(line, "line");
        if (k0.J2(line, this.$prefix, false, 2, null)) {
            l1.h<String> hVar = this.$value;
            ?? Substring = line.substring(this.$prefix.length());
            m0.o(Substring, "this as java.lang.String).substring(startIndex)");
            hVar.f102749b = Substring;
        }
    }
}
