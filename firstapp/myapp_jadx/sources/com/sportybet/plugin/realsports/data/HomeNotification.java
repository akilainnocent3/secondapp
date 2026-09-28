package com.sportybet.plugin.realsports.data;

import defpackage.dy5;
import defpackage.gpp;
import defpackage.mtg0;
import defpackage.ngm;
import defpackage.ogm;
import defpackage.x7g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007Ê\u0001\f\b\t\u0012\b\b\n\u0012\u0004\b\u0003\u0010\u0000¨\u0006\b"}, d2 = {"Lcom/sportybet/plugin/realsports/data/HomeNotification;", "", "<init>", "()V", "Hide", "Show", "Lcom/sportybet/plugin/realsports/data/HomeNotification$Hide;", "Lcom/sportybet/plugin/realsports/data/HomeNotification$Show;", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class HomeNotification {
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0083\u0004J\n\u0010\b\u001a\u00020\tHÖ\u0081\u0004J\n\u0010\n\u001a\u00020\u000bHÖ\u0081\u0004Ê\u0001\f\b\r\u0012\b\b\u000e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\f"}, d2 = {"Lcom/sportybet/plugin/realsports/data/HomeNotification$Hide;", "Lcom/sportybet/plugin/realsports/data/HomeNotification;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Hide extends HomeNotification {
        public static final int $stable = 0;
        public static final Hide INSTANCE = new Hide();

        private Hide() {
            super(null);
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Hide);
        }

        public int hashCode() {
            return 1310147655;
        }

        public String toString() {
            return "Hide";
        }
    }

    public /* synthetic */ HomeNotification(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private HomeNotification() {
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\f\b\u0001\u0010\u0002\u001a\u00020\u0003:\u0002\b\u0004\u0012\f\b\u0001\u0010\u0005\u001a\u00020\u0003:\u0002\b\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003JO\u0010\u001b\u001a\u00020\u00002\f\b\u0003\u0010\u0002\u001a\u00020\u0003:\u0002\b\u00042\f\b\u0003\u0010\u0005\u001a\u00020\u0003:\u0002\b\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u001b\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014Ê\u0001\f\b#\u0012\b\b$\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/plugin/realsports/data/HomeNotification$Show;", "Lcom/sportybet/plugin/realsports/data/HomeNotification;", "hint", "", "Landroidx/annotation/StringRes;", "actionLabel", "dismissible", "", "actionCallback", "Lkotlin/Function0;", "", "dismissCallback", "<init>", "(IIZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getHint", "()I", "getActionLabel", "getDismissible", "()Z", "getActionCallback", "()Lkotlin/jvm/functions/Function0;", "getDismissCallback", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Show extends HomeNotification {
        public static final int $stable = 0;
        private final Function0<Unit> actionCallback;
        private final int actionLabel;
        private final Function0<Unit> dismissCallback;
        private final boolean dismissible;
        private final int hint;

        public /* synthetic */ Show(int i, int i2, boolean z, Function0 function0, Function0 function1, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, (i3 & 4) != 0 ? true : z, (i3 & 8) != 0 ? new ngm(0) : function0, (i3 & 16) != 0 ? new ogm(0) : function1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Show copy$default(Show show, int i, int i2, boolean z, Function0 function0, Function0 function1, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = show.hint;
            }
            if ((i3 & 2) != 0) {
                i2 = show.actionLabel;
            }
            if ((i3 & 4) != 0) {
                z = show.dismissible;
            }
            if ((i3 & 8) != 0) {
                function0 = show.actionCallback;
            }
            if ((i3 & 16) != 0) {
                function1 = show.dismissCallback;
            }
            Function0 function2 = function1;
            boolean z2 = z;
            return show.copy(i, i2, z2, function0, function2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final int getHint() {
            return this.hint;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getActionLabel() {
            return this.actionLabel;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final boolean getDismissible() {
            return this.dismissible;
        }

        public final Function0<Unit> component4() {
            return this.actionCallback;
        }

        public final Function0<Unit> component5() {
            return this.dismissCallback;
        }

        public final Show copy(int hint, int actionLabel, boolean dismissible, Function0<Unit> actionCallback, Function0<Unit> dismissCallback) {
            actionCallback.getClass();
            dismissCallback.getClass();
            return new Show(hint, actionLabel, dismissible, actionCallback, dismissCallback);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Show)) {
                return false;
            }
            Show show = (Show) other;
            return this.hint == show.hint && this.actionLabel == show.actionLabel && this.dismissible == show.dismissible && Intrinsics.g(this.actionCallback, show.actionCallback) && Intrinsics.g(this.dismissCallback, show.dismissCallback);
        }

        public final Function0<Unit> getActionCallback() {
            return this.actionCallback;
        }

        public final int getActionLabel() {
            return this.actionLabel;
        }

        public final Function0<Unit> getDismissCallback() {
            return this.dismissCallback;
        }

        public final boolean getDismissible() {
            return this.dismissible;
        }

        public final int getHint() {
            return this.hint;
        }

        public int hashCode() {
            return this.dismissCallback.hashCode() + x7g.a(mtg0.a(gpp.a(this.actionLabel, Integer.hashCode(this.hint) * 31, 31), 31, this.dismissible), 31, this.actionCallback);
        }

        public String toString() {
            int i = this.hint;
            int i2 = this.actionLabel;
            boolean z = this.dismissible;
            Function0<Unit> function0 = this.actionCallback;
            Function0<Unit> function1 = this.dismissCallback;
            StringBuilder sbA = dy5.a("Show(hint=", i, i2, ", actionLabel=", ", dismissible=");
            sbA.append(z);
            sbA.append(", actionCallback=");
            sbA.append(function0);
            sbA.append(", dismissCallback=");
            sbA.append(function1);
            sbA.append(")");
            return sbA.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Show(int i, int i2, boolean z, Function0<Unit> function0, Function0<Unit> function1) {
            super(null);
            function0.getClass();
            function1.getClass();
            this.hint = i;
            this.actionLabel = i2;
            this.dismissible = z;
            this.actionCallback = function0;
            this.dismissCallback = function1;
        }
    }
}
