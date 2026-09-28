package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class pa0 {
    public final a840 a;
    public final ael b;

    public pa0(a840 a840Var, mb0 mb0Var, kgt kgtVar) {
        ael lcnVar;
        this.a = a840Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            if (!bel.a) {
                lcnVar = (i == 26 || i == 27) ? new xcs(kgtVar) : new lcn(true);
            }
            this.b = lcnVar;
        }
        boolean z = bel.a;
        lcnVar = new lcn(false);
        this.b = lcnVar;
    }

    public static s9s a(nan nanVar) {
        e5f0 e5f0Var = nanVar.c;
        Object context = e5f0Var instanceof vbn ? ((vbn) e5f0Var).getView().getContext() : nanVar.a;
        while (!(context instanceof ibs)) {
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return ((ibs) context).getLifecycle();
    }

    public static boolean b(nan nanVar, Bitmap.Config config) {
        if (!ze4.b(config)) {
            return true;
        }
        if (!((Boolean) q4h.a(nanVar, abn.f)).booleanValue()) {
            return false;
        }
        e5f0 e5f0Var = nanVar.c;
        if (!(e5f0Var instanceof vbn)) {
            return true;
        }
        View view = ((vbn) e5f0Var).getView();
        return !view.isAttachedToWindow() || view.isHardwareAccelerated();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0081 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:23:0x0084  */
    /* JADX WARN: Code duplicated, block: B:25:0x0088  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:8:0x004b  */
    public final u2z c(nan nanVar, ww90 ww90Var) {
        boolean z;
        Context context;
        ww90 ww90Var2;
        boolean z2;
        boolean z3;
        LinkedHashMap linkedHashMap;
        Context context2 = nanVar.a;
        vy60 vy60Var = nanVar.r;
        dm20 dm20Var = nanVar.s;
        blh blhVar = nanVar.f;
        wr5 wr5Var = nanVar.k;
        wr5 wr5Var2 = nanVar.l;
        wr5 wr5Var3 = nanVar.m;
        p4h.b<Bitmap.Config> bVar = abn.b;
        Bitmap.Config config = (Bitmap.Config) q4h.a(nanVar, bVar);
        p4h.b<Boolean> bVar2 = abn.g;
        boolean zBooleanValue = ((Boolean) q4h.a(nanVar, bVar2)).booleanValue();
        p4h.b<List<osg0>> bVar3 = uan.a;
        if (((List) q4h.a(nanVar, bVar3)).isEmpty()) {
            z = true;
        } else {
            if (ay0.s((Bitmap.Config) q4h.a(nanVar, bVar), vsh0.a)) {
                z = true;
            } else {
                z = false;
            }
        }
        if (ze4.b((Bitmap.Config) q4h.a(nanVar, bVar))) {
            if (b(nanVar, (Bitmap.Config) q4h.a(nanVar, bVar))) {
                context = context2;
                ww90Var2 = ww90Var;
                if (this.b.a(ww90Var2)) {
                }
                if (z || !z2) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (zBooleanValue || !((List) q4h.a(nanVar, bVar3)).isEmpty() || config == Bitmap.Config.ALPHA_8) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                linkedHashMap = new LinkedHashMap(kpu.h(nanVar.v.n.a, nanVar.t.a));
                if (config != ((Bitmap.Config) q4h.a(nanVar, bVar))) {
                    if (config != null) {
                        linkedHashMap.put(bVar, config);
                    } else {
                        linkedHashMap.remove(bVar);
                    }
                }
                if (z3 != ((Boolean) q4h.a(nanVar, bVar2)).booleanValue()) {
                    linkedHashMap.put(bVar2, Boolean.valueOf(z3));
                }
                return new u2z(context, ww90Var2, vy60Var, dm20Var, null, blhVar, wr5Var, wr5Var2, wr5Var3, new p4h(h58.b(linkedHashMap)));
            }
            context = context2;
            ww90Var2 = ww90Var;
            z2 = false;
            if (z) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.ARGB_8888;
            }
            if (zBooleanValue) {
                z3 = false;
            } else {
                z3 = false;
            }
            linkedHashMap = new LinkedHashMap(kpu.h(nanVar.v.n.a, nanVar.t.a));
            if (config != ((Bitmap.Config) q4h.a(nanVar, bVar))) {
                if (config != null) {
                    linkedHashMap.put(bVar, config);
                } else {
                    linkedHashMap.remove(bVar);
                }
            }
            if (z3 != ((Boolean) q4h.a(nanVar, bVar2)).booleanValue()) {
                linkedHashMap.put(bVar2, Boolean.valueOf(z3));
            }
            return new u2z(context, ww90Var2, vy60Var, dm20Var, null, blhVar, wr5Var, wr5Var2, wr5Var3, new p4h(h58.b(linkedHashMap)));
        }
        context = context2;
        ww90Var2 = ww90Var;
        z2 = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        if (zBooleanValue) {
            z3 = false;
        } else {
            z3 = false;
        }
        linkedHashMap = new LinkedHashMap(kpu.h(nanVar.v.n.a, nanVar.t.a));
        if (config != ((Bitmap.Config) q4h.a(nanVar, bVar))) {
            if (config != null) {
                linkedHashMap.put(bVar, config);
            } else {
                linkedHashMap.remove(bVar);
            }
        }
        if (z3 != ((Boolean) q4h.a(nanVar, bVar2)).booleanValue()) {
            linkedHashMap.put(bVar2, Boolean.valueOf(z3));
        }
        return new u2z(context, ww90Var2, vy60Var, dm20Var, null, blhVar, wr5Var, wr5Var2, wr5Var3, new p4h(h58.b(linkedHashMap)));
    }

    public final u2z d(u2z u2zVar) {
        boolean z;
        p4h p4hVar = u2zVar.j;
        p4h.b<Bitmap.Config> bVar = abn.b;
        if (!ze4.b((Bitmap.Config) q4h.b(u2zVar, bVar)) || this.b.b()) {
            z = false;
        } else {
            p4hVar.getClass();
            LinkedHashMap linkedHashMapM = kpu.m(p4hVar.a);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (config != null) {
                linkedHashMapM.put(bVar, config);
            } else {
                linkedHashMapM.remove(bVar);
            }
            p4hVar = new p4h(h58.b(linkedHashMapM));
            z = true;
        }
        return z ? new u2z(u2zVar.a, u2zVar.b, u2zVar.c, u2zVar.d, u2zVar.e, u2zVar.f, u2zVar.g, u2zVar.h, u2zVar.i, p4hVar) : u2zVar;
    }
}
