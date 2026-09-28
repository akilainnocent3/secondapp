package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class sgx {
    public final Context a;
    public final ufx b;
    public final Intent c;
    public final fhx d;
    public final ArrayList e;

    public static final class a {
        public final int a;
        public final Bundle b;

        public a(int i, Bundle bundle) {
            this.a = i;
            this.b = bundle;
        }
    }

    public sgx(yfx yfxVar) {
        Intent launchIntentForPackage;
        Context context = yfxVar.a;
        context.getClass();
        this.a = context;
        this.b = new ufx(context);
        Activity activity = (Activity) ld80.e(ld80.j(fd80.c(context, new qgx()), new rgx()));
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.c = launchIntentForPackage;
        this.e = new ArrayList();
        this.d = yfxVar.b.j();
    }

    public final v5f0 a() {
        ArrayList arrayList = this.e;
        if (arrayList.isEmpty()) {
            ib5.a("You must call setDestination() or addDestination() before constructing the deep link");
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
        int size = arrayList.size();
        ygx ygxVar = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            a aVar = (a) obj;
            int i2 = aVar.a;
            Bundle bundle = aVar.b;
            ygx ygxVarB = b(i2);
            if (ygxVarB == null) {
                int i3 = ygx.f;
                nrh0.a(ygx.a.a(this.b, i2), "Navigation destination ", " cannot be found in the navigation graph ", this.d);
                return null;
            }
            for (int i4 : ygxVarB.d(ygxVar)) {
                arrayList2.add(Integer.valueOf(i4));
                arrayList3.add(bundle);
            }
            ygxVar = ygxVarB;
        }
        int[] iArrZ0 = CollectionsKt.z0(arrayList2);
        Intent intent = this.c;
        intent.putExtra("android-support-nav:controller:deepLinkIds", iArrZ0);
        intent.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList3);
        v5f0 v5f0Var = new v5f0(this.a);
        Intent intent2 = new Intent(intent);
        ComponentName component = intent2.getComponent();
        if (component == null) {
            component = intent2.resolveActivity(v5f0Var.b.getPackageManager());
        }
        if (component != null) {
            v5f0Var.a(component);
        }
        ArrayList<Intent> arrayList4 = v5f0Var.a;
        arrayList4.add(intent2);
        int size2 = arrayList4.size();
        for (int i5 = 0; i5 < size2; i5++) {
            Intent intent3 = arrayList4.get(i5);
            if (intent3 != null) {
                intent3.putExtra("android-support-nav:controller:deepLinkIntent", intent);
            }
        }
        return v5f0Var;
    }

    public final ygx b(int i) {
        gx0 gx0Var = new gx0();
        gx0Var.addLast(this.d);
        while (!gx0Var.isEmpty()) {
            ygx ygxVar = (ygx) gx0Var.removeFirst();
            if (ygxVar.b.e == i) {
                return ygxVar;
            }
            if (ygxVar instanceof fhx) {
                Iterator<ygx> it = ((fhx) ygxVar).iterator();
                while (true) {
                    khx khxVar = (khx) it;
                    if (khxVar.hasNext()) {
                        gx0Var.addLast((ygx) khxVar.next());
                    }
                }
            }
        }
        return null;
    }

    public final void c() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            int i2 = ((a) obj).a;
            if (b(i2) == null) {
                int i3 = ygx.f;
                f87.b(he.a("Navigation destination ", ygx.a.a(this.b, i2), " cannot be found in the navigation graph "), this.d);
                return;
            }
        }
    }
}
