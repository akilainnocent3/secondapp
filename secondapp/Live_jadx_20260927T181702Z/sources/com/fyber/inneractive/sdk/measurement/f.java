package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.t0;
import com.fyber.inneractive.sdk.network.z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AdSession f45100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdEvents f45101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MediaEvents f45102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f45103d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f45104e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f45105f;

    public final void a(Throwable th2) {
        String simpleName = th2.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th2.getMessage();
        t0 t0Var = this.f45105f;
        z.a(simpleName, str, t0Var != null ? t0Var.f45031a : null, t0Var != null ? t0Var.f45032b : null);
    }

    public final ArrayList a(List list) {
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (hVar.f45108a != null) {
                    if (!TextUtils.isEmpty(hVar.f45112e) && !TextUtils.isEmpty(hVar.f45111d)) {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(hVar.f45112e, hVar.f45108a, hVar.f45111d);
                    } else {
                        verificationScriptResourceCreateVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(hVar.f45108a);
                    }
                    verificationScriptResource = verificationScriptResourceCreateVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th2) {
                a(th2);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
