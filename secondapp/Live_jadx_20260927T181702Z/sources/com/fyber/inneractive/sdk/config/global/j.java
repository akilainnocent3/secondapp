package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f44385b;

    public j(boolean z10, String str) {
        this.f44384a = str;
        this.f44385b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x010a  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0111  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.config.global.d
    public final boolean a(e eVar) {
        boolean z10;
        boolean z11;
        if (!TextUtils.isEmpty(this.f44384a)) {
            String version = InneractiveAdManager.getVersion();
            IAlog.a("%s: shouldApply - running version: %s", c2.j.f22221a, version);
            IAlog.a("%s: shouldApply - filter version: %s", c2.j.f22221a, this.f44384a);
            String[] strArrSplit = version.split("\\.", 4);
            String[] strArrSplit2 = this.f44384a.split("\\.", 4);
            String str = strArrSplit2[strArrSplit2.length - 1];
            if (str.equals("*")) {
                int i10 = 0;
                while (true) {
                    if (i10 >= strArrSplit2.length - 1) {
                        IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", c2.j.f22221a);
                        z11 = false;
                        break;
                    }
                    if (strArrSplit.length < i10) {
                        IAlog.a("%s: shouldApplyByAsterix - running version is shorter than filter. applying", c2.j.f22221a);
                    } else if (strArrSplit[i10].equals(strArrSplit2[i10])) {
                        i10++;
                    } else {
                        IAlog.a("%s: shouldApplyByAsterix - running version does not comply with filter. applying", c2.j.f22221a);
                    }
                    z11 = true;
                    break;
                }
                IAlog.a("%s: shouldApply - * version match: %b", c2.j.f22221a, Boolean.valueOf(!z11));
                if (z11) {
                    return this.f44385b;
                }
                return !this.f44385b;
            }
            if (str.equals(com.google.android.material.badge.a.f50153v)) {
                int i11 = 0;
                while (true) {
                    if (i11 < strArrSplit2.length - 1) {
                        if (strArrSplit.length < i11) {
                            IAlog.a("%s: shouldApplyByPlus - running version is shorter than filter. applying", c2.j.f22221a);
                        } else {
                            try {
                                int iIntValue = Integer.valueOf(strArrSplit2[i11]).intValue();
                                int iIntValue2 = Integer.valueOf(strArrSplit[i11]).intValue();
                                if (iIntValue2 > iIntValue) {
                                    IAlog.a("%s: shouldApplyByPlus - running version is greater than the filter's version. no filter needed", c2.j.f22221a);
                                } else if (iIntValue2 < iIntValue) {
                                    IAlog.a("%s: shouldApplyByPlus - running version is lower than the filter's version. applying filter ", c2.j.f22221a);
                                } else {
                                    i11++;
                                }
                            } catch (NumberFormatException e10) {
                                IAlog.a("%s: shouldApplyByPlus - Error in version string! Not a number. %s", c2.j.f22221a, e10.getMessage());
                            }
                        }
                        z10 = true;
                        IAlog.a("%s: shouldApply - + version match: %b", c2.j.f22221a, Boolean.valueOf(!z10));
                        if (z10) {
                            return this.f44385b;
                        }
                        if (this.f44385b) {
                            return false;
                        }
                        return true;
                    }
                    IAlog.a("%s: shouldApplyByAsterix - version aligned with filter. do not apply", c2.j.f22221a);
                    z10 = false;
                    IAlog.a("%s: shouldApply - + version match: %b", c2.j.f22221a, Boolean.valueOf(!z10));
                    if (z10) {
                        return this.f44385b;
                    }
                    if (this.f44385b) {
                        return true;
                    }
                    return false;
                }
            }
            boolean zEqualsIgnoreCase = this.f44384a.equalsIgnoreCase(version);
            IAlog.a("%s: shouldApply - exact version match: %b", c2.j.f22221a, Boolean.valueOf(zEqualsIgnoreCase));
            if (!zEqualsIgnoreCase) {
                return this.f44385b;
            }
            if (!this.f44385b) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "sdk - " + this.f44384a + " include: " + this.f44385b;
    }
}
