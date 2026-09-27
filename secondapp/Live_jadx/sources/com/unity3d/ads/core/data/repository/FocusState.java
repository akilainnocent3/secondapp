package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface FocusState {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Focused implements FocusState {

        @l
        private final WeakReference<Activity> activity;

        public Focused(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Focused copy$default(Focused focused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = focused.getActivity();
            }
            return focused.copy(weakReference);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @l
        public final Focused copy(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            return new Focused(activity);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Focused) && m0.g(getActivity(), ((Focused) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @l
        public String toString() {
            return "Focused(activity=" + getActivity() + ')';
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Unfocused implements FocusState {

        @l
        private final WeakReference<Activity> activity;

        public Unfocused(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            this.activity = activity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Unfocused copy$default(Unfocused unfocused, WeakReference weakReference, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                weakReference = unfocused.getActivity();
            }
            return unfocused.copy(weakReference);
        }

        @l
        public final WeakReference<Activity> component1() {
            return getActivity();
        }

        @l
        public final Unfocused copy(@l WeakReference<Activity> activity) {
            m0.p(activity, "activity");
            return new Unfocused(activity);
        }

        public boolean equals(@m Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Unfocused) && m0.g(getActivity(), ((Unfocused) obj).getActivity());
        }

        @Override // com.unity3d.ads.core.data.repository.FocusState
        @l
        public WeakReference<Activity> getActivity() {
            return this.activity;
        }

        public int hashCode() {
            return getActivity().hashCode();
        }

        @l
        public String toString() {
            return "Unfocused(activity=" + getActivity() + ')';
        }
    }

    @l
    WeakReference<Activity> getActivity();
}
