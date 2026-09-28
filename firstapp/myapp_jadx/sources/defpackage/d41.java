package defpackage;

import androidx.media3.common.a;

/* JADX INFO: loaded from: classes.dex */
public final class d41 extends Exception {
    public final int a;
    public final boolean b;
    public final a c;

    public d41(int i, a aVar, boolean z) {
        super(hce0.a(i, "AudioTrack write failed: "));
        this.b = z;
        this.a = i;
        this.c = aVar;
    }
}
