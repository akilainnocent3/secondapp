package com.google.android.datatransport.cct;

import defpackage.fs1;
import defpackage.nug0;
import defpackage.qu6;
import defpackage.zxb;

/* JADX INFO: loaded from: classes.dex */
public class CctBackendFactory implements fs1 {
    @Override // defpackage.fs1
    public nug0 create(zxb zxbVar) {
        return new qu6(zxbVar.a(), zxbVar.d(), zxbVar.c());
    }
}
