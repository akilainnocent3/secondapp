package p2;

import android.animation.LayoutTransition;
import android.annotation.TargetApi;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@androidx.databinding.h({@androidx.databinding.g(attribute = "android:alwaysDrawnWithCache", method = "setAlwaysDrawnWithCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:animationCache", method = "setAnimationCacheEnabled", type = ViewGroup.class), @androidx.databinding.g(attribute = "android:splitMotionEvents", method = "setMotionEventSplittingEnabled", type = ViewGroup.class)})
@y0({y0.a.LIBRARY})
public class k0 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ViewGroup.OnHierarchyChangeListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f120353b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f120354c;

        public a(f fVar, g gVar) {
            this.f120353b = fVar;
            this.f120354c = gVar;
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            f fVar = this.f120353b;
            if (fVar != null) {
                fVar.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            g gVar = this.f120354c;
            if (gVar != null) {
                gVar.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ e f120355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f120356c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ d f120357d;

        public b(e eVar, c cVar, d dVar) {
            this.f120355b = eVar;
            this.f120356c = cVar;
            this.f120357d = dVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            c cVar = this.f120356c;
            if (cVar != null) {
                cVar.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            d dVar = this.f120357d;
            if (dVar != null) {
                dVar.onAnimationRepeat(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e eVar = this.f120355b;
            if (eVar != null) {
                eVar.onAnimationStart(animation);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void onAnimationEnd(Animation animation);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void onAnimationRepeat(Animation animation);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e {
        void onAnimationStart(Animation animation);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface f {
        void onChildViewAdded(View view, View view2);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface g {
        void onChildViewRemoved(View view, View view2);
    }

    @androidx.databinding.d({"android:animateLayoutChanges"})
    @TargetApi(11)
    public static void a(ViewGroup viewGroup, boolean z10) {
        if (z10) {
            viewGroup.setLayoutTransition(new LayoutTransition());
        } else {
            viewGroup.setLayoutTransition(null);
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onAnimationStart", "android:onAnimationEnd", "android:onAnimationRepeat"})
    public static void b(ViewGroup viewGroup, e eVar, c cVar, d dVar) {
        if (eVar == null && cVar == null && dVar == null) {
            viewGroup.setLayoutAnimationListener(null);
        } else {
            viewGroup.setLayoutAnimationListener(new b(eVar, cVar, dVar));
        }
    }

    @androidx.databinding.d(requireAll = false, value = {"android:onChildViewAdded", "android:onChildViewRemoved"})
    public static void c(ViewGroup viewGroup, f fVar, g gVar) {
        if (fVar == null && gVar == null) {
            viewGroup.setOnHierarchyChangeListener(null);
        } else {
            viewGroup.setOnHierarchyChangeListener(new a(fVar, gVar));
        }
    }
}
