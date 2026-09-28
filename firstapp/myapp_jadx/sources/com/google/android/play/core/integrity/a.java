package com.google.android.play.core.integrity;

import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import defpackage.ib5;

/* JADX INFO: loaded from: classes4.dex */
final class a extends au {
    private String a;
    private long b;
    private ag c;
    private byte d;

    @Override // com.google.android.play.core.integrity.au
    public final au a(ag agVar) {
        this.c = agVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.au
    public final au b(long j) {
        this.b = j;
        this.d = (byte) 1;
        return this;
    }

    @Override // com.google.android.play.core.integrity.au
    public final au c(String str) {
        this.a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.au
    public final av d() {
        String str;
        ag agVar;
        if (this.d == 1 && (str = this.a) != null && (agVar = this.c) != null) {
            return new av(str, this.b, agVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(ACKxwYRsuWyGz.lgrT);
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
