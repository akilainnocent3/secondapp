package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f46909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] f46910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46911c;

    public y(com.fyber.inneractive.sdk.player.exoplayer2.o... oVarArr) {
        if (oVarArr.length <= 0) {
            throw new IllegalStateException();
        }
        this.f46910b = oVarArr;
        this.f46909a = oVarArr.length;
    }

    public final int a(com.fyber.inneractive.sdk.player.exoplayer2.o oVar) {
        int i10 = 0;
        while (true) {
            com.fyber.inneractive.sdk.player.exoplayer2.o[] oVarArr = this.f46910b;
            if (i10 >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y.class == obj.getClass()) {
            y yVar = (y) obj;
            if (this.f46909a == yVar.f46909a && Arrays.equals(this.f46910b, yVar.f46910b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.f46911c == 0) {
            this.f46911c = Arrays.hashCode(this.f46910b) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.f46911c;
    }
}
