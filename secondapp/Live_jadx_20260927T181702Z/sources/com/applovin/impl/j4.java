package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class j4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f27337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FriendlyObstructionPurpose f27338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f27339c;

    public j4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f27337a = view;
        this.f27338b = friendlyObstructionPurpose;
        this.f27339c = str;
    }

    public String a() {
        return this.f27339c;
    }

    public FriendlyObstructionPurpose b() {
        return this.f27338b;
    }

    public View c() {
        return this.f27337a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            j4 j4Var = (j4) obj;
            View view = this.f27337a;
            if (view == null ? j4Var.f27337a != null : !view.equals(j4Var.f27337a)) {
                return false;
            }
            if (this.f27338b != j4Var.f27338b) {
                return false;
            }
            String str = this.f27339c;
            String str2 = j4Var.f27339c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f27337a;
        int iHashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.f27338b;
        int iHashCode2 = (iHashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.f27339c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
