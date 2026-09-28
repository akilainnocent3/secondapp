package com.google.android.play.core.integrity;

import defpackage.bmy;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
final class b extends bv {
    private String a;
    private long b;
    private ag c;
    private byte d;

    @Override // com.google.android.play.core.integrity.bv
    public final bv a(ag agVar) {
        this.c = agVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bv
    public final bv b(long j) {
        this.b = j;
        this.d = (byte) 1;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bv
    public final bv c(String str) {
        if (str != null) {
            this.a = str;
            return this;
        }
        bmy.a("Null token");
        return null;
    }

    @Override // com.google.android.play.core.integrity.bv
    public final bw d() {
        String str;
        ag agVar;
        if (this.d == 1 && (str = this.a) != null && (agVar = this.c) != null) {
            return new bw(str, this.b, agVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" token");
        }
        if (this.d == 0) {
            sb.append(" requestTokenSessionId");
        }
        if (this.c == null) {
            sb.append(" integrityDialogWrapper");
        }
        ib5.a("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
