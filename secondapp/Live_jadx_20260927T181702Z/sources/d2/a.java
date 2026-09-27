package d2;

import android.transition.Transition;
import dr.w2;
import ds.l;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n1#1,76:1\n59#1,16:77\n59#1,16:93\n59#1,16:109\n59#1,16:125\n59#1,16:141\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt\n*L\n26#1:77,16\n33#1:93,16\n40#1:109,16\n47#1:125,16\n54#1:141,16\n*E\n"})
public final class a {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n*L\n1#1,76:1\n*E\n"})
    public static final class f implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l<Transition, w2> f77703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ l<Transition, w2> f77704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l<Transition, w2> f77705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l<Transition, w2> f77706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ l<Transition, w2> f77707f;

        /* JADX WARN: Multi-variable type inference failed */
        public f(l<? super Transition, w2> lVar, l<? super Transition, w2> lVar2, l<? super Transition, w2> lVar3, l<? super Transition, w2> lVar4, l<? super Transition, w2> lVar5) {
            this.f77703b = lVar;
            this.f77704c = lVar2;
            this.f77705d = lVar3;
            this.f77706e = lVar4;
            this.f77707f = lVar5;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@oy.l Transition transition) {
            this.f77706e.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@oy.l Transition transition) {
            this.f77703b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@oy.l Transition transition) {
            this.f77705d.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@oy.l Transition transition) {
            this.f77704c.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@oy.l Transition transition) {
            this.f77707f.invoke(transition);
        }
    }

    @oy.l
    public static final Transition.TransitionListener a(@oy.l Transition transition, @oy.l l<? super Transition, w2> lVar, @oy.l l<? super Transition, w2> lVar2, @oy.l l<? super Transition, w2> lVar3, @oy.l l<? super Transition, w2> lVar4, @oy.l l<? super Transition, w2> lVar5) {
        f fVar = new f(lVar, lVar4, lVar5, lVar3, lVar2);
        transition.addListener(fVar);
        return fVar;
    }

    public static /* synthetic */ Transition.TransitionListener b(Transition transition, l lVar, l lVar2, l lVar3, l lVar4, l lVar5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C0762a.f77698g;
        }
        if ((i10 & 2) != 0) {
            lVar2 = b.f77699g;
        }
        l lVar6 = lVar2;
        if ((i10 & 4) != 0) {
            lVar3 = c.f77700g;
        }
        if ((i10 & 8) != 0) {
            lVar4 = d.f77701g;
        }
        if ((i10 & 16) != 0) {
            lVar5 = e.f77702g;
        }
        f fVar = new f(lVar, lVar4, lVar5, lVar3, lVar6);
        transition.addListener(fVar);
        return fVar;
    }

    @oy.l
    public static final Transition.TransitionListener c(@oy.l Transition transition, @oy.l l<? super Transition, w2> lVar) {
        g gVar = new g(lVar);
        transition.addListener(gVar);
        return gVar;
    }

    @oy.l
    public static final Transition.TransitionListener d(@oy.l Transition transition, @oy.l l<? super Transition, w2> lVar) {
        h hVar = new h(lVar);
        transition.addListener(hVar);
        return hVar;
    }

    @oy.l
    public static final Transition.TransitionListener e(@oy.l Transition transition, @oy.l l<? super Transition, w2> lVar) {
        i iVar = new i(lVar);
        transition.addListener(iVar);
        return iVar;
    }

    @oy.l
    public static final Transition.TransitionListener f(@oy.l Transition transition, @oy.l l<? super Transition, w2> lVar) {
        j jVar = new j(lVar);
        transition.addListener(jVar);
        return jVar;
    }

    @oy.l
    public static final Transition.TransitionListener g(@oy.l Transition transition, @oy.l l<? super Transition, w2> lVar) {
        k kVar = new k(lVar);
        transition.addListener(kVar);
        return kVar;
    }

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n*L\n1#1,76:1\n*E\n"})
    public static final class C0762a extends o0 implements l<Transition, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C0762a f77698g = new C0762a();

        public C0762a() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Transition transition) {
            a(transition);
            return w2.f79517a;
        }

        public final void a(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,76:1\n*E\n"})
    public static final class b extends o0 implements l<Transition, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f77699g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Transition transition) {
            a(transition);
            return w2.f79517a;
        }

        public final void a(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n*L\n1#1,76:1\n*E\n"})
    public static final class c extends o0 implements l<Transition, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f77700g = new c();

        public c() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Transition transition) {
            a(transition);
            return w2.f79517a;
        }

        public final void a(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n*L\n1#1,76:1\n*E\n"})
    public static final class d extends o0 implements l<Transition, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f77701g = new d();

        public d() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Transition transition) {
            a(transition);
            return w2.f79517a;
        }

        public final void a(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n*L\n1#1,76:1\n*E\n"})
    public static final class e extends o0 implements l<Transition, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final e f77702g = new e();

        public e() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Transition transition) {
            a(transition);
            return w2.f79517a;
        }

        public final void a(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,76:1\n60#2:77\n63#3:78\n64#4:79\n61#5:80\n*E\n"})
    public static final class g implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f77708b;

        public g(l lVar) {
            this.f77708b = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@oy.l Transition transition) {
            this.f77708b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,76:1\n63#2:77\n64#3:78\n62#4:79\n61#5:80\n*E\n"})
    public static final class h implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f77709b;

        public h(l lVar) {
            this.f77709b = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@oy.l Transition transition) {
            this.f77709b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,76:1\n60#2:77\n63#3:78\n62#4:79\n61#5:80\n*E\n"})
    public static final class i implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f77710b;

        public i(l lVar) {
            this.f77710b = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@oy.l Transition transition) {
            this.f77710b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$2\n*L\n1#1,76:1\n60#2:77\n64#3:78\n62#4:79\n61#5:80\n*E\n"})
    public static final class j implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f77711b;

        public j(l lVar) {
            this.f77711b = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@oy.l Transition transition) {
            this.f77711b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@oy.l Transition transition) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$listener$1\n+ 2 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$1\n+ 3 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$4\n+ 4 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$5\n+ 5 Transition.kt\nandroidx/core/transition/TransitionKt$addListener$3\n*L\n1#1,76:1\n60#2:77\n63#3:78\n64#4:79\n62#5:80\n*E\n"})
    public static final class k implements Transition.TransitionListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f77712b;

        public k(l lVar) {
            this.f77712b = lVar;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(@oy.l Transition transition) {
            this.f77712b.invoke(transition);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(@oy.l Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(@oy.l Transition transition) {
        }
    }
}
