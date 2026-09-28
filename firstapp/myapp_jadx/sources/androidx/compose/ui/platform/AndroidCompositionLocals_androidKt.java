package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.m;
import com.sportybet.android.gp.tz.R;
import defpackage.a60;
import defpackage.ate;
import defpackage.b60;
import defpackage.chf;
import defpackage.cte;
import defpackage.dte;
import defpackage.eh50;
import defpackage.hna;
import defpackage.hvx;
import defpackage.ib5;
import defpackage.ibs;
import defpackage.j730;
import defpackage.jv60;
import defpackage.kna;
import defpackage.mt60;
import defpackage.ndt;
import defpackage.nt60;
import defpackage.nv60;
import defpackage.op8;
import defpackage.pp8;
import defpackage.pt60;
import defpackage.qlr;
import defpackage.qyd0;
import defpackage.r50;
import defpackage.sbn;
import defpackage.t50;
import defpackage.u50;
import defpackage.ucd;
import defpackage.udt;
import defpackage.una;
import defpackage.v50;
import defpackage.wc0;
import defpackage.x50;
import defpackage.xma;
import defpackage.xvf;
import defpackage.y50;
import defpackage.ydl;
import defpackage.ytw;
import defpackage.zdl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\" \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/runtime/d;", "Libs;", "getLocalLifecycleOwner", "()Landroidx/compose/runtime/d;", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "Landroid/content/res/Configuration;", "configuration", "ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {
    public static final chf a = new chf(a.a);
    public static final qyd0 b = new qyd0(b.a);
    public static final una c = new una(e.a);
    public static final qyd0 d = new qyd0(c.a);
    public static final qyd0 e = new qyd0(d.a);
    public static final qyd0 f = new qyd0(f.a);

    public static final class a extends qlr implements Function0<Configuration> {
        public static final a a = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Configuration invoke() {
            AndroidCompositionLocals_androidKt.b("LocalConfiguration");
            throw null;
        }
    }

    public static final class b extends qlr implements Function0<Context> {
        public static final b a = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Context invoke() {
            AndroidCompositionLocals_androidKt.b("LocalContext");
            throw null;
        }
    }

    public static final class c extends qlr implements Function0<sbn> {
        public static final c a = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final sbn invoke() {
            AndroidCompositionLocals_androidKt.b("LocalImageVectorCache");
            throw null;
        }
    }

    public static final class d extends qlr implements Function0<eh50> {
        public static final d a = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final eh50 invoke() {
            AndroidCompositionLocals_androidKt.b("LocalResourceIdCache");
            throw null;
        }
    }

    public static final class e extends qlr implements Function1<xma, Resources> {
        public static final e a = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Resources invoke(xma xmaVar) {
            xma xmaVar2 = xmaVar;
            xmaVar2.a(AndroidCompositionLocals_androidKt.a);
            return ((Context) xmaVar2.a(AndroidCompositionLocals_androidKt.b)).getResources();
        }
    }

    public static final class f extends qlr implements Function0<View> {
        public static final f a = new f(0);

        @Override // kotlin.jvm.functions.Function0
        public final View invoke() {
            AndroidCompositionLocals_androidKt.b("LocalView");
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(AndroidComposeView androidComposeView, op8 op8Var, androidx.compose.runtime.a aVar, int i) {
        boolean z;
        androidx.compose.runtime.b bVarI = aVar.i(-520299287);
        int i2 = (bVarI.A(androidComposeView) ? 4 : 2) | i | (bVarI.A(op8Var) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            Context context = androidComposeView.getContext();
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(new Configuration(context.getResources().getConfiguration()));
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new r50(ytwVar);
                bVarI.r(objY2);
            }
            androidComposeView.setConfigurationChangeObserver((Function1) objY2);
            Object objY3 = bVarI.y();
            if (objY3 == c0042a) {
                objY3 = new wc0(context);
                bVarI.r(objY3);
            }
            wc0 wc0Var = (wc0) objY3;
            AndroidComposeView.b viewTreeOwners = androidComposeView.getViewTreeOwners();
            if (viewTreeOwners == null) {
                ib5.a("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
            nv60 nv60Var = viewTreeOwners.b;
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                Object parent = androidComposeView.getParent();
                parent.getClass();
                View view = (View) parent;
                Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                LinkedHashMap linkedHashMap = null;
                String strValueOf = tag instanceof String ? (String) tag : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view.getId());
                }
                String str = mt60.class.getSimpleName() + ':' + strValueOf;
                jv60 savedStateRegistry = nv60Var.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(str);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str2 : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str2);
                        parcelableArrayList.getClass();
                        linkedHashMap.put(str2, parcelableArrayList);
                    }
                }
                qyd0 qyd0Var = pt60.a;
                final nt60 nt60Var = new nt60(linkedHashMap, dte.a);
                try {
                    savedStateRegistry.c(str, new jv60.b() { // from class: bte
                        @Override // jv60.b
                        public final Bundle a() {
                            Map<String, List<Object>> mapD = nt60Var.d();
                            Bundle bundle = new Bundle();
                            for (Map.Entry<String, List<Object>> entry : mapD.entrySet()) {
                                String key = entry.getKey();
                                List<Object> value = entry.getValue();
                                bundle.putParcelableArrayList(key, value instanceof ArrayList ? (ArrayList) value : new ArrayList<>(value));
                            }
                            return bundle;
                        }
                    });
                    z = true;
                } catch (IllegalArgumentException unused) {
                    z = false;
                }
                ate ateVar = new ate(nt60Var, new cte(z, savedStateRegistry, str));
                bVarI.r(ateVar);
                objY4 = ateVar;
            }
            ate ateVar2 = (ate) objY4;
            Unit unit = Unit.a;
            boolean zA = bVarI.A(ateVar2);
            Object objY5 = bVarI.y();
            if (zA || objY5 == c0042a) {
                objY5 = new t50(ateVar2);
                bVarI.r(objY5);
            }
            xvf.c(unit, (Function1) objY5, bVarI);
            Object objY6 = bVarI.y();
            if (objY6 == c0042a) {
                objY6 = ydl.a(context) ? new ucd(androidComposeView.getView()) : new hvx();
                bVarI.r(objY6);
            }
            zdl zdlVar = (zdl) objY6;
            Configuration configuration = (Configuration) ytwVar.getValue();
            Object objY7 = bVarI.y();
            if (objY7 == c0042a) {
                objY7 = new sbn();
                bVarI.r(objY7);
            }
            sbn sbnVar = (sbn) objY7;
            Object objY8 = bVarI.y();
            Object obj = objY8;
            if (objY8 == c0042a) {
                Configuration configuration2 = new Configuration();
                if (configuration != null) {
                    configuration2.setTo(configuration);
                }
                bVarI.r(configuration2);
                obj = configuration2;
            }
            Configuration configuration3 = (Configuration) obj;
            Object objY9 = bVarI.y();
            if (objY9 == c0042a) {
                objY9 = new y50(configuration3, sbnVar);
                bVarI.r(objY9);
            }
            y50 y50Var = (y50) objY9;
            boolean zA2 = bVarI.A(context);
            Object objY10 = bVarI.y();
            if (zA2 || objY10 == c0042a) {
                objY10 = new x50(context, y50Var);
                bVarI.r(objY10);
            }
            xvf.c(sbnVar, (Function1) objY10, bVarI);
            Object objY11 = bVarI.y();
            if (objY11 == c0042a) {
                objY11 = new eh50();
                bVarI.r(objY11);
            }
            eh50 eh50Var = (eh50) objY11;
            Object objY12 = bVarI.y();
            if (objY12 == c0042a) {
                objY12 = new b60(eh50Var);
                bVarI.r(objY12);
            }
            b60 b60Var = (b60) objY12;
            boolean zA3 = bVarI.A(context);
            Object objY13 = bVarI.y();
            if (zA3 || objY13 == c0042a) {
                objY13 = new a60(context, b60Var);
                bVarI.r(objY13);
            }
            xvf.c(eh50Var, (Function1) objY13, bVarI);
            chf chfVar = kna.v;
            hna.b(new j730[]{a.a((Configuration) ytwVar.getValue()), b.a(context), ndt.a.a(viewTreeOwners.a), udt.a.a(nv60Var), pt60.a.a(ateVar2), f.a(androidComposeView.getView()), d.a(sbnVar), e.a(eh50Var), chfVar.a(Boolean.valueOf(((Boolean) bVarI.O(chfVar)).booleanValue() | androidComposeView.getScrollCaptureInProgress$ui_release())), kna.l.a(zdlVar)}, pp8.b(1059770793, new u50(androidComposeView, wc0Var, op8Var), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new v50(androidComposeView, op8Var, i);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final androidx.compose.runtime.d<ibs> getLocalLifecycleOwner() {
        return ndt.a;
    }
}
