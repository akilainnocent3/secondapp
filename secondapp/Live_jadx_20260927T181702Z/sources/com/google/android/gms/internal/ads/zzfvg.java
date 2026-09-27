package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class zzfvg implements zzfve {
    private final zzfve zza;

    public zzfvg(zzfve zzfveVar) {
        this.zza = zzfveVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final JSONObject zza(View view) {
        JSONObject jSONObjectZzb = zzfvo.zzb(0, 0, 0, 0);
        int iZzb = zzfvr.zzb();
        int i10 = iZzb - 1;
        if (iZzb == 0) {
            throw null;
        }
        try {
            jSONObjectZzb.put("noOutputDevice", i10 == 0);
            return jSONObjectZzb;
        } catch (JSONException e10) {
            zzfvp.zza("Error with setting output device status", e10);
            return jSONObjectZzb;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfve
    public final void zzb(View view, JSONObject jSONObject, zzfvd zzfvdVar, boolean z10, boolean z11) {
        ArrayList arrayList = new ArrayList();
        zzfus zzfusVarZza = zzfus.zza();
        if (zzfusVarZza != null) {
            Collection collectionZzf = zzfusVarZza.zzf();
            int size = collectionZzf.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionZzf.iterator();
            while (it.hasNext()) {
                View viewZzi = ((zzfty) it.next()).zzi();
                if (viewZzi != null && viewZzi.isAttachedToWindow() && viewZzi.isShown()) {
                    View view2 = viewZzi;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewZzi.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z12 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i10 = size2 - 1;
                                    if (((View) arrayList.get(i10)).getZ() <= z12) {
                                        break;
                                    } else {
                                        size2 = i10;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            zzfvdVar.zza((View) arrayList.get(i11), this.zza, jSONObject, z11);
        }
    }
}
