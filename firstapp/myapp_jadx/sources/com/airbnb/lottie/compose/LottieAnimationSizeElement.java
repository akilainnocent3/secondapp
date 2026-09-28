package com.airbnb.lottie.compose;

import androidx.compose.ui.d;
import defpackage.n36;
import defpackage.p3w;
import defpackage.pmt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Lp3w;", "Lpmt;", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class LottieAnimationSizeElement extends p3w<pmt> {
    public final int b;
    public final int c;

    public LottieAnimationSizeElement(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.p3w
    public final d.c a() {
        pmt pmtVar = new pmt();
        pmtVar.D = this.b;
        pmtVar.E = this.c;
        return pmtVar;
    }

    @Override // defpackage.p3w
    public final void d(d.c cVar) {
        pmt pmtVar = (pmt) cVar;
        pmtVar.getClass();
        pmtVar.D = this.b;
        pmtVar.E = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) obj;
        return this.b == lottieAnimationSizeElement.b && this.c == lottieAnimationSizeElement.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + (Integer.hashCode(this.b) * 31);
    }

    public final String toString() {
        return n36.a("LottieAnimationSizeElement(width=", this.b, this.c, ", height=", ")");
    }
}
