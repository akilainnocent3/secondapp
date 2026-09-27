package vj;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjm;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f141221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uj.a.b f141222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppMeasurementSdk f141223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f141224d;

    public e(AppMeasurementSdk appMeasurementSdk, uj.a.b bVar) {
        this.f141222b = bVar;
        this.f141223c = appMeasurementSdk;
        d dVar = new d(this);
        this.f141224d = dVar;
        appMeasurementSdk.registerOnMeasurementEventListener(dVar);
        this.f141221a = new HashSet();
    }

    @Override // vj.a
    public final void a(Set set) {
        Set set2 = this.f141221a;
        set2.clear();
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (hashSet.size() >= 50) {
                break;
            }
            int i10 = c.f141219g;
            if (str != null && str.length() != 0) {
                int iCodePointAt = str.codePointAt(0);
                if (!Character.isLetter(iCodePointAt)) {
                    if (iCodePointAt == 95) {
                        iCodePointAt = 95;
                    }
                }
                int length = str.length();
                int iCharCount = Character.charCount(iCodePointAt);
                while (true) {
                    if (iCharCount >= length) {
                        if (str.length() == 0) {
                            break;
                        }
                        int iCodePointAt2 = str.codePointAt(0);
                        if (!Character.isLetter(iCodePointAt2)) {
                            break;
                        }
                        int length2 = str.length();
                        int iCharCount2 = Character.charCount(iCodePointAt2);
                        while (true) {
                            if (iCharCount2 < length2) {
                                int iCodePointAt3 = str.codePointAt(iCharCount2);
                                if (iCodePointAt3 != 95 && !Character.isLetterOrDigit(iCodePointAt3)) {
                                    break;
                                } else {
                                    iCharCount2 += Character.charCount(iCodePointAt3);
                                }
                            } else {
                                String strZzb = zzjm.zzb(str);
                                if (strZzb != null) {
                                    str = strZzb;
                                }
                                Preconditions.checkNotNull(str);
                                hashSet.add(str);
                                break;
                            }
                        }
                    } else {
                        int iCodePointAt4 = str.codePointAt(iCharCount);
                        if (iCodePointAt4 != 95 && !Character.isLetterOrDigit(iCodePointAt4)) {
                            break;
                        } else {
                            iCharCount += Character.charCount(iCodePointAt4);
                        }
                    }
                }
            }
        }
        set2.addAll(hashSet);
    }

    public final /* synthetic */ uj.a.b b() {
        return this.f141222b;
    }

    @Override // vj.a
    public final uj.a.b zza() {
        return this.f141222b;
    }

    @Override // vj.a
    public final void zzc() {
        this.f141221a.clear();
    }
}
