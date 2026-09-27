package c1;

import android.animation.Animator;
import dr.w2;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.s1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n1#1,123:1\n91#1,14:124\n91#1,14:138\n91#1,14:152\n91#1,14:166\n*S KotlinDebug\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt\n*L\n30#1:124,14\n41#1:138,14\n52#1:152,14\n62#1:166,14\n*E\n"})
public final class a {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n*L\n1#1,123:1\n*E\n"})
    public static final class e implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<Animator, w2> f22178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.l<Animator, w2> f22179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ ds.l<Animator, w2> f22180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ds.l<Animator, w2> f22181e;

        /* JADX WARN: Multi-variable type inference failed */
        public e(ds.l<? super Animator, w2> lVar, ds.l<? super Animator, w2> lVar2, ds.l<? super Animator, w2> lVar3, ds.l<? super Animator, w2> lVar4) {
            this.f22178b = lVar;
            this.f22179c = lVar2;
            this.f22180d = lVar3;
            this.f22181e = lVar4;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@oy.l Animator animator) {
            this.f22180d.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@oy.l Animator animator) {
            this.f22179c.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@oy.l Animator animator) {
            this.f22178b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@oy.l Animator animator) {
            this.f22181e.invoke(animator);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class h implements Animator.AnimatorPauseListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l<Animator, w2> f22184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ds.l<Animator, w2> f22185c;

        /* JADX WARN: Multi-variable type inference failed */
        public h(ds.l<? super Animator, w2> lVar, ds.l<? super Animator, w2> lVar2) {
            this.f22184b = lVar;
            this.f22185c = lVar2;
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(@oy.l Animator animator) {
            this.f22184b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(@oy.l Animator animator) {
            this.f22185c.invoke(animator);
        }
    }

    @oy.l
    public static final Animator.AnimatorListener a(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar, @oy.l ds.l<? super Animator, w2> lVar2, @oy.l ds.l<? super Animator, w2> lVar3, @oy.l ds.l<? super Animator, w2> lVar4) {
        e eVar = new e(lVar4, lVar, lVar3, lVar2);
        animator.addListener(eVar);
        return eVar;
    }

    public static /* synthetic */ Animator.AnimatorListener b(Animator animator, ds.l lVar, ds.l lVar2, ds.l lVar3, ds.l lVar4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C0207a.f22174g;
        }
        if ((i10 & 2) != 0) {
            lVar2 = b.f22175g;
        }
        if ((i10 & 4) != 0) {
            lVar3 = c.f22176g;
        }
        if ((i10 & 8) != 0) {
            lVar4 = d.f22177g;
        }
        e eVar = new e(lVar4, lVar, lVar3, lVar2);
        animator.addListener(eVar);
        return eVar;
    }

    @oy.l
    public static final Animator.AnimatorPauseListener c(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar, @oy.l ds.l<? super Animator, w2> lVar2) {
        h hVar = new h(lVar2, lVar);
        animator.addPauseListener(hVar);
        return hVar;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener d(Animator animator, ds.l lVar, ds.l lVar2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = f.f22182g;
        }
        if ((i10 & 2) != 0) {
            lVar2 = g.f22183g;
        }
        return c(animator, lVar, lVar2);
    }

    @oy.l
    public static final Animator.AnimatorListener e(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar) {
        i iVar = new i(lVar);
        animator.addListener(iVar);
        return iVar;
    }

    @oy.l
    public static final Animator.AnimatorListener f(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar) {
        j jVar = new j(lVar);
        animator.addListener(jVar);
        return jVar;
    }

    @oy.l
    public static final Animator.AnimatorPauseListener g(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar) {
        return d(animator, null, lVar, 1, null);
    }

    @oy.l
    public static final Animator.AnimatorListener h(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar) {
        k kVar = new k(lVar);
        animator.addListener(kVar);
        return kVar;
    }

    @oy.l
    public static final Animator.AnimatorPauseListener i(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar) {
        return d(animator, lVar, null, 2, null);
    }

    @oy.l
    public static final Animator.AnimatorListener j(@oy.l Animator animator, @oy.l ds.l<? super Animator, w2> lVar) {
        l lVar2 = new l(lVar);
        animator.addListener(lVar2);
        return lVar2;
    }

    /* JADX INFO: renamed from: c1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n*L\n1#1,123:1\n*E\n"})
    public static final class C0207a extends o0 implements ds.l<Animator, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final C0207a f22174g = new C0207a();

        public C0207a() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Animator animator) {
            a(animator);
            return w2.f79517a;
        }

        public final void a(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n*E\n"})
    public static final class b extends o0 implements ds.l<Animator, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f22175g = new b();

        public b() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Animator animator) {
            a(animator);
            return w2.f79517a;
        }

        public final void a(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,123:1\n*E\n"})
    public static final class c extends o0 implements ds.l<Animator, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final c f22176g = new c();

        public c() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Animator animator) {
            a(animator);
            return w2.f79517a;
        }

        public final void a(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n*L\n1#1,123:1\n*E\n"})
    public static final class d extends o0 implements ds.l<Animator, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f22177g = new d();

        public d() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Animator animator) {
            a(animator);
            return w2.f79517a;
        }

        public final void a(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f extends o0 implements ds.l<Animator, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final f f22182g = new f();

        public f() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Animator animator) {
            a(animator);
            return w2.f79517a;
        }

        public final void a(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class g extends o0 implements ds.l<Animator, w2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g f22183g = new g();

        public g() {
            super(1);
        }

        @Override // ds.l
        public /* bridge */ /* synthetic */ w2 invoke(Animator animator) {
            a(animator);
            return w2.f79517a;
        }

        public final void a(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n92#3:125\n93#4:126\n*E\n"})
    public static final class i implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l f22186b;

        public i(ds.l lVar) {
            this.f22186b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@oy.l Animator animator) {
            this.f22186b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n95#2:124\n94#3:125\n93#4:126\n*E\n"})
    public static final class j implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l f22187b;

        public j(ds.l lVar) {
            this.f22187b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@oy.l Animator animator) {
            this.f22187b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$2\n*L\n1#1,123:1\n92#2:124\n94#3:125\n93#4:126\n*E\n"})
    public static final class k implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l f22188b;

        public k(ds.l lVar) {
            this.f22188b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@oy.l Animator animator) {
            this.f22188b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@oy.l Animator animator) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @s1({"SMAP\nAnimator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$listener$1\n+ 2 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$4\n+ 3 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$1\n+ 4 Animator.kt\nandroidx/core/animation/AnimatorKt$addListener$3\n*L\n1#1,123:1\n95#2:124\n92#3:125\n94#4:126\n*E\n"})
    public static final class l implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ds.l f22189b;

        public l(ds.l lVar) {
            this.f22189b = lVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(@oy.l Animator animator) {
            this.f22189b.invoke(animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(@oy.l Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(@oy.l Animator animator) {
        }
    }
}
