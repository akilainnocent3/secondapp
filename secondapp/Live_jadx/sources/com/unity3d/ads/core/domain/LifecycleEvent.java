package com.unity3d.ads.core.domain;

import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface LifecycleEvent {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Created implements LifecycleEvent {

        @l
        private final WeakReference<Activity> activity;

        @m
        private final Bundle bundle;

        public Created(@l WeakReference<Activity> activity, @m Bundle bundle) {
            m0.p(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Created copy$default(Created created, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = created.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = created.bundle;
            }
            return created.copy(weakReference, bundle);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @m
        public final Bundle component2() {
            return this.bundle;
        }

        @l
        public final Created copy(@l WeakReference<Activity> activity, @m Bundle bundle) {
            m0.p(activity, "activity");
            return new Created(activity, bundle);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Created)) {
                return false;
            }
            Created created = (Created) obj;
            return m0.g(getActivity(), created.getActivity()) && m0.g(this.bundle, created.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        @m
        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @l
        public String toString() {
            return "Created(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Destroyed implements LifecycleEvent {

        @l
        private final WeakReference<Activity> activity;

        public Destroyed(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Destroyed copy$default(Destroyed destroyed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = destroyed.getActivity();
            }
            return destroyed.copy(weakReference);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @l
        public final Destroyed copy(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            return new Destroyed(activity);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Destroyed) && m0.g(getActivity(), ((Destroyed) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @l
        public String toString() {
            return "Destroyed(activity=" + getActivity() + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Paused implements LifecycleEvent {

        @l
        private final WeakReference<Activity> activity;

        public Paused(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Paused copy$default(Paused paused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = paused.getActivity();
            }
            return paused.copy(weakReference);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @l
        public final Paused copy(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            return new Paused(activity);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Paused) && m0.g(getActivity(), ((Paused) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @l
        public String toString() {
            return "Paused(activity=" + getActivity() + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Resumed implements LifecycleEvent {

        @l
        private final WeakReference<Activity> activity;

        public Resumed(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Resumed copy$default(Resumed resumed, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = resumed.getActivity();
            }
            return resumed.copy(weakReference);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @l
        public final Resumed copy(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            return new Resumed(activity);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Resumed) && m0.g(getActivity(), ((Resumed) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @l
        public String toString() {
            return "Resumed(activity=" + getActivity() + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class SaveInstanceState implements LifecycleEvent {

        @l
        private final WeakReference<Activity> activity;

        @m
        private final Bundle bundle;

        public SaveInstanceState(@l WeakReference<Activity> activity, @m Bundle bundle) {
            m0.p(activity, "activity");
            this.activity = activity;
            this.bundle = bundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SaveInstanceState copy$default(SaveInstanceState saveInstanceState, WeakReference weakReference, Bundle bundle, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = saveInstanceState.getActivity();
            }
            if ((i10 & 2) != 0) {
                bundle = saveInstanceState.bundle;
            }
            return saveInstanceState.copy(weakReference, bundle);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @m
        public final Bundle component2() {
            return this.bundle;
        }

        @l
        public final SaveInstanceState copy(@l WeakReference<Activity> activity, @m Bundle bundle) {
            m0.p(activity, "activity");
            return new SaveInstanceState(activity, bundle);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SaveInstanceState)) {
                return false;
            }
            SaveInstanceState saveInstanceState = (SaveInstanceState) obj;
            return m0.g(getActivity(), saveInstanceState.getActivity()) && m0.g(this.bundle, saveInstanceState.bundle);
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        @m
        public final Bundle getBundle() {
            return this.bundle;
        }

        public int hashCode() {
            int iHashCode = getActivity().hashCode() * 31;
            Bundle bundle = this.bundle;
            return iHashCode + (bundle == null ? 0 : bundle.hashCode());
        }

        @l
        public String toString() {
            return "SaveInstanceState(activity=" + getActivity() + ", bundle=" + this.bundle + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Started implements LifecycleEvent {

        @l
        private final WeakReference<Activity> activity;

        public Started(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Started copy$default(Started started, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = started.getActivity();
            }
            return started.copy(weakReference);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @l
        public final Started copy(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            return new Started(activity);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Started) && m0.g(getActivity(), ((Started) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @l
        public String toString() {
            return "Started(activity=" + getActivity() + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Stopped implements LifecycleEvent {

        @l
        private final WeakReference<Activity> activity;

        public Stopped(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Stopped copy$default(Stopped stopped, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = stopped.getActivity();
            }
            return stopped.copy(weakReference);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @l
        public final Stopped copy(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            return new Stopped(activity);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Stopped) && m0.g(getActivity(), ((Stopped) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.domain.LifecycleEvent
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @l
        public String toString() {
            return "Stopped(activity=" + getActivity() + ')';
        }
    }

    @l
    WeakReference<Activity> getActivity();
}
