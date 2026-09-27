package com.mbridge.msdk.config.component.load.downloader.core;

import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c extends FutureTask<h> implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f65370a;

    public c(h hVar) {
        super(hVar, null);
        this.f65370a = hVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        h hVar = this.f65370a;
        com.mbridge.msdk.config.component.load.downloader.c cVar2 = hVar.f65426a;
        h hVar2 = cVar.f65370a;
        com.mbridge.msdk.config.component.load.downloader.c cVar3 = hVar2.f65426a;
        return cVar2 == cVar3 ? hVar.f65427b - hVar2.f65427b : cVar3.ordinal() - cVar2.ordinal();
    }
}
