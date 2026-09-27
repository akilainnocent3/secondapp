package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import cv.k0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k.y0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t.b(androidx.appcompat.widget.c.f6970r)
@s1({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,499:1\n179#2,2:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n45#1:500,2\n*E\n"})
public class a extends t<b> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    public static final C0136a f17995e = new C0136a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final String f17996f = "android-support-navigation:ActivityNavigator:source";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final String f17997g = "android-support-navigation:ActivityNavigator:current";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @oy.l
    public static final String f17998h = "android-support-navigation:ActivityNavigator:popEnterAnim";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @oy.l
    public static final String f17999i = "android-support-navigation:ActivityNavigator:popExitAnim";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @oy.l
    public static final String f18000j = "ActivityNavigator";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oy.l
    public final Context f18001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.m
    public final Activity f18002d;

    /* JADX INFO: renamed from: androidx.navigation.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0136a {
        public /* synthetic */ C0136a(x xVar) {
            this();
        }

        @cs.o
        public final void a(@oy.l Activity activity) {
            m0.p(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent == null) {
                return;
            }
            int intExtra = intent.getIntExtra(a.f17998h, -1);
            int intExtra2 = intent.getIntExtra(a.f17999i, -1);
            if (intExtra == -1 && intExtra2 == -1) {
                return;
            }
            if (intExtra == -1) {
                intExtra = 0;
            }
            if (intExtra2 == -1) {
                intExtra2 = 0;
            }
            activity.overridePendingTransition(intExtra, intExtra2);
        }

        public C0136a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @l.a(Activity.class)
    @s1({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,499:1\n232#2,3:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n256#1:500,3\n*E\n"})
    public static class b extends l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @oy.m
        public Intent f18003n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @oy.m
        public String f18004o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @oy.m
        public String f18005p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @oy.m
        public ComponentName f18006q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        @oy.m
        public String f18007r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @oy.m
        public Uri f18008s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@oy.l t<? extends b> activityNavigator) {
            super(activityNavigator);
            m0.p(activityNavigator, "activityNavigator");
        }

        @Override // androidx.navigation.l
        @k.i
        public void G(@oy.l Context context, @oy.l AttributeSet attrs) {
            m0.p(context, "context");
            m0.p(attrs, "attrs");
            super.G(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, w.c.f18363a);
            m0.o(typedArrayObtainAttributes, "context.resources.obtain…leable.ActivityNavigator)");
            i0(a0(context, typedArrayObtainAttributes.getString(w.c.f18368f)));
            String string = typedArrayObtainAttributes.getString(w.c.f18364b);
            if (string != null) {
                if (string.charAt(0) == '.') {
                    string = context.getPackageName() + string;
                }
                c0(new ComponentName(context, string));
            }
            b0(typedArrayObtainAttributes.getString(w.c.f18365c));
            String strA0 = a0(context, typedArrayObtainAttributes.getString(w.c.f18366d));
            if (strA0 != null) {
                e0(Uri.parse(strA0));
            }
            f0(a0(context, typedArrayObtainAttributes.getString(w.c.f18367e)));
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.l
        @y0({y0.a.LIBRARY_GROUP})
        public boolean T() {
            return false;
        }

        @oy.m
        public final String U() {
            Intent intent = this.f18003n;
            if (intent != null) {
                return intent.getAction();
            }
            return null;
        }

        @oy.m
        public final ComponentName V() {
            Intent intent = this.f18003n;
            if (intent != null) {
                return intent.getComponent();
            }
            return null;
        }

        @oy.m
        public final Uri W() {
            Intent intent = this.f18003n;
            if (intent != null) {
                return intent.getData();
            }
            return null;
        }

        @oy.m
        public final String X() {
            return this.f18004o;
        }

        @oy.m
        public final Intent Y() {
            return this.f18003n;
        }

        @oy.m
        public final String Z() {
            Intent intent = this.f18003n;
            if (intent != null) {
                return intent.getPackage();
            }
            return null;
        }

        public final String a0(Context context, String str) {
            if (str == null) {
                return null;
            }
            String packageName = context.getPackageName();
            m0.o(packageName, "context.packageName");
            return k0.z2(str, o.f18279h, packageName, false, 4, null);
        }

        @oy.l
        public final b b0(@oy.m String str) {
            if (this.f18003n == null) {
                this.f18003n = new Intent();
            }
            Intent intent = this.f18003n;
            m0.m(intent);
            intent.setAction(str);
            return this;
        }

        @oy.l
        public final b c0(@oy.m ComponentName componentName) {
            if (this.f18003n == null) {
                this.f18003n = new Intent();
            }
            Intent intent = this.f18003n;
            m0.m(intent);
            intent.setComponent(componentName);
            return this;
        }

        @oy.l
        public final b e0(@oy.m Uri uri) {
            if (this.f18003n == null) {
                this.f18003n = new Intent();
            }
            Intent intent = this.f18003n;
            m0.m(intent);
            intent.setData(uri);
            return this;
        }

        @Override // androidx.navigation.l
        public boolean equals(@oy.m Object obj) {
            boolean zFilterEquals;
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b) && super.equals(obj)) {
                Intent intent = this.f18003n;
                if (intent != null) {
                    zFilterEquals = intent.filterEquals(((b) obj).f18003n);
                } else {
                    zFilterEquals = ((b) obj).f18003n == null;
                }
                if (zFilterEquals && m0.g(this.f18004o, ((b) obj).f18004o)) {
                    return true;
                }
            }
            return false;
        }

        @oy.l
        public final b f0(@oy.m String str) {
            this.f18004o = str;
            return this;
        }

        @oy.l
        public final b h0(@oy.m Intent intent) {
            this.f18003n = intent;
            return this;
        }

        @Override // androidx.navigation.l
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            Intent intent = this.f18003n;
            int iFilterHashCode = (iHashCode + (intent != null ? intent.filterHashCode() : 0)) * 31;
            String str = this.f18004o;
            return iFilterHashCode + (str != null ? str.hashCode() : 0);
        }

        @oy.l
        public final b i0(@oy.m String str) {
            if (this.f18003n == null) {
                this.f18003n = new Intent();
            }
            Intent intent = this.f18003n;
            m0.m(intent);
            intent.setPackage(str);
            return this;
        }

        @Override // androidx.navigation.l
        @oy.l
        public String toString() {
            ComponentName componentNameV = V();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            if (componentNameV != null) {
                sb2.append(" class=");
                sb2.append(componentNameV.getClassName());
            } else {
                String strU = U();
                if (strU != null) {
                    sb2.append(" action=");
                    sb2.append(strU);
                }
            }
            String string = sb2.toString();
            m0.o(string, "sb.toString()");
            return string;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(@oy.l u navigatorProvider) {
            this((t<? extends b>) navigatorProvider.e(a.class));
            m0.p(navigatorProvider, "navigatorProvider");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements t.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f18009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @oy.m
        public final d1.e f18010b;

        /* JADX INFO: renamed from: androidx.navigation.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public static final class C0137a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f18011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @oy.m
            public d1.e f18012b;

            @oy.l
            public final C0137a a(int i10) {
                this.f18011a = i10 | this.f18011a;
                return this;
            }

            @oy.l
            public final c b() {
                return new c(this.f18011a, this.f18012b);
            }

            @oy.l
            public final C0137a c(@oy.l d1.e activityOptions) {
                m0.p(activityOptions, "activityOptions");
                this.f18012b = activityOptions;
                return this;
            }
        }

        public c(int i10, @oy.m d1.e eVar) {
            this.f18009a = i10;
            this.f18010b = eVar;
        }

        @oy.m
        public final d1.e a() {
            return this.f18010b;
        }

        public final int b() {
            return this.f18009a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends o0 implements ds.l<Context, Context> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f18013g = new d();

        public d() {
            super(1);
        }

        @Override // ds.l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Context invoke(Context it) {
            m0.p(it, "it");
            if (it instanceof ContextWrapper) {
                return ((ContextWrapper) it).getBaseContext();
            }
            return null;
        }
    }

    public a(@oy.l Context context) {
        m0.p(context, "context");
        this.f18001c = context;
        for (Object obj : zu.x.v(context, d.f18013g)) {
            if (((Context) obj) instanceof Activity) {
                this.f18002d = (Activity) obj;
            }
        }
        obj = null;
        this.f18002d = (Activity) obj;
    }

    @cs.o
    public static final void l(@oy.l Activity activity) {
        f17995e.a(activity);
    }

    @Override // androidx.navigation.t
    public boolean k() {
        Activity activity = this.f18002d;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }

    @Override // androidx.navigation.t
    @oy.l
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b a() {
        return new b(this);
    }

    @oy.l
    @y0({y0.a.LIBRARY_GROUP})
    public final Context n() {
        return this.f18001c;
    }

    @Override // androidx.navigation.t
    @oy.m
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public l d(@oy.l b destination, @oy.m Bundle bundle, @oy.m p pVar, @oy.m t.a aVar) {
        d1.e eVarA;
        Intent intent;
        int intExtra;
        m0.p(destination, "destination");
        if (destination.Y() == null) {
            throw new IllegalStateException(("Destination " + destination.u() + " does not have an Intent set.").toString());
        }
        Intent intent2 = new Intent(destination.Y());
        if (bundle != null) {
            intent2.putExtras(bundle);
            String strX = destination.X();
            if (strX != null && strX.length() != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(strX);
                while (matcher.find()) {
                    String strGroup = matcher.group(1);
                    if (!bundle.containsKey(strGroup)) {
                        throw new IllegalArgumentException("Could not find " + strGroup + " in " + bundle + " to fill data pattern " + strX);
                    }
                    matcher.appendReplacement(stringBuffer, "");
                    stringBuffer.append(Uri.encode(String.valueOf(bundle.get(strGroup))));
                }
                matcher.appendTail(stringBuffer);
                intent2.setData(Uri.parse(stringBuffer.toString()));
            }
        }
        boolean z10 = aVar instanceof c;
        if (z10) {
            intent2.addFlags(((c) aVar).b());
        }
        if (this.f18002d == null) {
            intent2.addFlags(268435456);
        }
        if (pVar != null && pVar.k()) {
            intent2.addFlags(536870912);
        }
        Activity activity = this.f18002d;
        if (activity != null && (intent = activity.getIntent()) != null && (intExtra = intent.getIntExtra(f17997g, 0)) != 0) {
            intent2.putExtra(f17996f, intExtra);
        }
        intent2.putExtra(f17997g, destination.u());
        Resources resources = this.f18001c.getResources();
        if (pVar != null) {
            int iC = pVar.c();
            int iD = pVar.d();
            if ((iC <= 0 || !m0.g(resources.getResourceTypeName(iC), "animator")) && (iD <= 0 || !m0.g(resources.getResourceTypeName(iD), "animator"))) {
                intent2.putExtra(f17998h, iC);
                intent2.putExtra(f17999i, iD);
            } else {
                Log.w(f18000j, "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources.getResourceName(iC) + " and popExit resource " + resources.getResourceName(iD) + " when launching " + destination);
            }
        }
        if (!z10 || (eVarA = ((c) aVar).a()) == null) {
            this.f18001c.startActivity(intent2);
        } else {
            f1.d.startActivity(this.f18001c, intent2, eVarA.m());
        }
        if (pVar == null || this.f18002d == null) {
            return null;
        }
        int iA = pVar.a();
        int iB = pVar.b();
        if ((iA <= 0 || !m0.g(resources.getResourceTypeName(iA), "animator")) && (iB <= 0 || !m0.g(resources.getResourceTypeName(iB), "animator"))) {
            if (iA < 0 && iB < 0) {
                return null;
            }
            this.f18002d.overridePendingTransition(ms.u.u(iA, 0), ms.u.u(iB, 0));
            return null;
        }
        Log.w(f18000j, "Activity destinations do not support Animator resource. Ignoring enter resource " + resources.getResourceName(iA) + " and exit resource " + resources.getResourceName(iB) + "when launching " + destination);
        return null;
    }
}
