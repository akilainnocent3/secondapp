package wc;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@s1({"SMAP\nAdSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSize.kt\ncom/cleversolutions/ads/AdSize\n+ 2 AdSizeFactory.kt\ncom/cleveradssolutions/internal/CASUtils__AdSizeFactoryKt\n*L\n1#1,161:1\n18#2,4:162\n18#2,4:166\n21#2:170\n*S KotlinDebug\n*F\n+ 1 AdSize.kt\ncom/cleversolutions/ads/AdSize\n*L\n132#1:162,4\n134#1:166,4\n138#1:170\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oy.l
    public static final a f142742d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final f f142743e = new f(320, 50, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final f f142744f = new f(728, 90, 0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    @cs.g
    public static final f f142745g = new f(300, 250, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f142746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f142747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f142748c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAdSize.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdSize.kt\ncom/cleversolutions/ads/AdSize$Companion\n+ 2 DebugUnit.kt\ncom/cleveradssolutions/internal/CASUtils__DebugUnitKt\n+ 3 AdSizeFactory.kt\ncom/cleveradssolutions/internal/CASUtils__AdSizeFactoryKt\n*L\n1#1,161:1\n47#2,9:162\n47#2,9:171\n24#3,4:180\n27#3:184\n*S KotlinDebug\n*F\n+ 1 AdSize.kt\ncom/cleversolutions/ads/AdSize$Companion\n*L\n56#1:162,9\n58#1:171,9\n107#1:180,4\n119#1:184\n*E\n"})
    public static final class a {
        public a() {
        }

        @oy.l
        @cs.o
        public final f a(@oy.l Context context, int i10) {
            m0.p(context, "context");
            return b(context, i10, 0);
        }

        @oy.l
        @cs.o
        public final f b(@oy.l Context context, int i10, int i11) {
            int iMax;
            int iMin;
            int iL0;
            int iMax2;
            int i12;
            WindowManager windowManager;
            m0.p(context, "context");
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            m0.p(context, "context");
            if (i10 < 0) {
                m0.p(context, "<this>");
                if (context instanceof Activity) {
                    windowManager = ((Activity) context).getWindowManager();
                } else {
                    Object systemService = context.getSystemService("window");
                    m0.n(systemService, "null cannot be cast to non-null type android.view.WindowManager");
                    windowManager = (WindowManager) systemService;
                }
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                iMax = is.d.L0(displayMetrics.widthPixels / displayMetrics.density);
            } else {
                iMax = Math.max(i10, f.f142743e.i());
            }
            m0.p(context, "context");
            int i13 = 2;
            try {
                iMax2 = com.cleveradssolutions.internal.b.a(context, iMax, i11);
            } catch (Throwable unused) {
                f fVar = f.f142743e;
                Resources resources = context.getResources();
                DisplayMetrics displayMetrics2 = resources.getDisplayMetrics();
                if (i11 == 0) {
                    m0.m(displayMetrics2);
                    float f10 = iMax * displayMetrics2.density;
                    int i14 = displayMetrics2.widthPixels;
                    if (f10 < i14) {
                        i12 = displayMetrics2.heightPixels;
                    } else {
                        int iMin2 = Math.min(i14, displayMetrics2.heightPixels);
                        int iMax3 = Math.max(displayMetrics2.widthPixels, displayMetrics2.heightPixels);
                        i12 = f10 - ((float) iMin2) < ((float) ((iMax3 - iMin2) / 2)) ? iMax3 : iMin2;
                    }
                    iMin = Math.min(90, is.d.L0((i12 / displayMetrics2.density) * 0.15f));
                } else {
                    Configuration configuration = resources.getConfiguration();
                    m0.o(configuration, "getConfiguration(...)");
                    m0.m(displayMetrics2);
                    iMin = Math.min(90, is.d.L0((((i11 == 0 || configuration.orientation == i11) ? displayMetrics2.heightPixels : displayMetrics2.widthPixels) / displayMetrics2.density) * 0.15f));
                }
                if (iMax > 655) {
                    f fVar2 = f.f142744f;
                    iL0 = is.d.L0((iMax / fVar2.i()) * fVar2.f());
                } else if (iMax > 632) {
                    iL0 = 81;
                } else if (iMax > 526) {
                    iL0 = is.d.L0((iMax / 468.0f) * 60.0f);
                } else {
                    iL0 = iMax > 432 ? 68 : is.d.L0((iMax / fVar.i()) * fVar.f());
                }
                iMax2 = Math.max(Math.min(iL0, iMin), fVar.f());
            }
            return new f(iMax, iMax2, i13, null);
        }

        @oy.l
        @cs.o
        @dr.o(message = "Create Adaptive Banner size with maxWidthDP instead.")
        public final f c(@oy.l View container) {
            m0.p(container, "container");
            int width = container.getWidth() > 0 ? container.getWidth() : container.getMeasuredWidth();
            if (width <= 0) {
                return f.f142743e;
            }
            Context context = container.getContext();
            m0.o(context, "getContext(...)");
            Context context2 = container.getContext();
            m0.o(context2, "getContext(...)");
            DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
            m0.o(displayMetrics, "getDisplayMetrics(...)");
            return a(context, is.d.L0(width / displayMetrics.density));
        }

        @oy.l
        @cs.o
        public final f d(@oy.l Context context) {
            m0.p(context, "context");
            return a(context, -1);
        }

        @oy.l
        @cs.o
        public final f e(int i10, int i11) {
            kotlin.jvm.internal.x xVar = null;
            if (i11 < 32) {
                StringBuilder sbA = com.cleveradssolutions.internal.d.a(com.cleveradssolutions.internal.services.q.f43760b, new StringBuilder(), ": ");
                sbA.append("The maximum height set for the inline adaptive ad size was " + i11 + " dp, which is below the minimum recommended value of 32 dp.");
                sbA.append(' ');
                com.cleveradssolutions.internal.m.a(null, sbA, 5, "CAS.AI");
            }
            if (i10 >= 300) {
                return new f(i10, i11, 3, xVar);
            }
            StringBuilder sbA2 = com.cleveradssolutions.internal.d.a(com.cleveradssolutions.internal.services.q.f43760b, new StringBuilder(), ": ");
            sbA2.append("The width set for the inline adaptive ad size was " + i10 + " dp, with is below the minimum supported value of 300dp.");
            sbA2.append(' ');
            sbA2.append(Log.getStackTraceString(null));
            Log.println(5, "CAS.AI", sbA2.toString());
            int i12 = 0;
            return new f(i12, i12, i12, xVar);
        }

        @oy.l
        @cs.o
        public final f f(@oy.l Context context) {
            m0.p(context, "context");
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i10 = displayMetrics.heightPixels;
            m0.m(displayMetrics);
            return (((float) is.d.L0(((float) i10) / displayMetrics.density)) <= 720.0f || ((float) is.d.L0(((float) displayMetrics.widthPixels) / displayMetrics.density)) < 728.0f) ? f.f142743e : f.f142744f;
        }

        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }
    }

    public /* synthetic */ f(int i10, int i11, int i12, kotlin.jvm.internal.x xVar) {
        this(i10, i11, i12);
    }

    @oy.l
    @cs.o
    public static final f b(@oy.l Context context, int i10) {
        return f142742d.a(context, i10);
    }

    @oy.l
    @cs.o
    public static final f c(@oy.l Context context, int i10, int i11) {
        return f142742d.b(context, i10, i11);
    }

    @oy.l
    @cs.o
    @dr.o(message = "Create Adaptive Banner size with maxWidthDP instead.")
    public static final f d(@oy.l View view) {
        return f142742d.c(view);
    }

    @oy.l
    @cs.o
    public static final f e(@oy.l Context context) {
        return f142742d.d(context);
    }

    @oy.l
    @cs.o
    public static final f g(int i10, int i11) {
        return f142742d.e(i10, i11);
    }

    @oy.l
    @cs.o
    public static final f h(@oy.l Context context) {
        return f142742d.f(context);
    }

    @oy.m
    public final f a() {
        f[] fVarArr = {f142745g, f142744f, f142743e};
        for (int i10 = 0; i10 < 3; i10++) {
            f fVar = fVarArr[i10];
            if (this.f142746a >= fVar.f142746a && this.f142747b >= fVar.f142747b) {
                return fVar;
            }
        }
        return null;
    }

    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return fVar.f142746a == this.f142746a && fVar.f142747b == this.f142747b;
    }

    public final int f() {
        return this.f142747b;
    }

    public int hashCode() {
        return (this.f142746a * 31) + this.f142747b;
    }

    public final int i() {
        return this.f142746a;
    }

    public final int j(@oy.l Context context) {
        m0.p(context, "context");
        int i10 = this.f142747b;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m0.o(displayMetrics, "getDisplayMetrics(...)");
        return (int) ((i10 * displayMetrics.density) + 0.5f);
    }

    public final boolean k() {
        return this.f142748c == 2;
    }

    public final boolean l() {
        return this.f142748c == 3;
    }

    @oy.l
    public final Point m(@oy.l Context context) {
        m0.p(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i10 = this.f142746a;
        m0.m(displayMetrics);
        float f10 = displayMetrics.density;
        return new Point((int) ((i10 * f10) + 0.5f), (int) ((this.f142747b * f10) + 0.5f));
    }

    public final int n(@oy.l Context context) {
        m0.p(context, "context");
        int i10 = this.f142746a;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m0.o(displayMetrics, "getDisplayMetrics(...)");
        return (int) ((i10 * displayMetrics.density) + 0.5f);
    }

    @oy.l
    public String toString() {
        return gi.j.f86770c + this.f142746a + ", " + this.f142747b + ')';
    }

    public f(int i10, int i11, int i12) {
        this.f142746a = i10;
        this.f142747b = i11;
        this.f142748c = i12;
    }
}
