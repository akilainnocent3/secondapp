package com.fyber.inneractive.sdk.click;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.network.f0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f44273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f44275c;

    public m(r rVar, String str, String str2) {
        this.f44275c = rVar;
        this.f44273a = str;
        this.f44274b = str2;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z10) {
        c cVar = (c) obj;
        if (this.f44275c.f44282e) {
            return;
        }
        if (exc != null) {
            r.a(this.f44275c, null, this.f44273a, this.f44274b, exc);
            return;
        }
        if (cVar != null) {
            String str = this.f44273a;
            if (cVar.f44251a.size() > 1) {
                ArrayList arrayList = cVar.f44251a;
                str = (String) arrayList.get(arrayList.size() - 1);
            }
            b bVarA = this.f44275c.a(str);
            if ((bVarA == null || bVarA.f44245a == q.FAILED) && !TextUtils.isEmpty(cVar.f44252b)) {
                r rVar = this.f44275c;
                rVar.getClass();
                for (String str2 : cVar.f44251a) {
                    if (!TextUtils.equals(str2, str)) {
                        rVar.f44283f.add(new j(str2, true, q.INTERNAL_REDIRECT, null));
                    }
                }
                r.a(this.f44275c, cVar.f44252b, str, this.f44274b, null);
                return;
            }
            r rVar2 = this.f44275c;
            rVar2.getClass();
            for (String str3 : cVar.f44251a) {
                if (!TextUtils.equals(str3, str)) {
                    rVar2.f44283f.add(new j(str3, false, q.INTERNAL_REDIRECT, null));
                }
            }
            if (this.f44275c.f44283f.size() == 0) {
                this.f44275c.f44283f.add(new j(str, false, q.INTERNAL_REDIRECT, null));
            }
            this.f44275c.a(r.a(str, "followRedirects", "Invalid response"));
        }
    }
}
