package com.sportybet.plugin.realsports.event;

import android.R;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.transition.nfj.CaBJCMnsV;
import com.appsflyer.internal.a0;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.a1f0;
import defpackage.eco;
import defpackage.wf9;
import defpackage.ws7;
import defpackage.zi50;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0002\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/sportybet/plugin/realsports/event/LiveTimerTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "playedSeconds", "matchStatus", AnalyticsParam.EVENT_STATUS, "", "setLiveTime", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "label", "setStaticLabel", "(Ljava/lang/String;)V", "Lws7;", "v", "Lws7;", "getDisplayStrategy", "()Lws7;", "setDisplayStrategy", "(Lws7;)V", "displayStrategy", "b", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class LiveTimerTextView extends AppCompatTextView {
    public boolean A;
    public String B;
    public final eco C;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public ws7 displayStrategy;
    public int w;
    public int y;
    public String z;

    public static final class a {
        public static boolean d;
        public static long a = SystemClock.uptimeMillis() + 1000;
        public static final CopyOnWriteArraySet<Function0<Unit>> b = new CopyOnWriteArraySet<>();
        public static final Handler c = new Handler(Looper.getMainLooper());
        public static final RunnableC0428a e = new RunnableC0428a();

        /* JADX INFO: renamed from: com.sportybet.plugin.realsports.event.LiveTimerTextView$a$a, reason: collision with other inner class name */
        public static final class RunnableC0428a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                Iterator<T> it = a.b.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                a.a += 1000;
                a.c.postAtTime(this, a.a);
            }
        }
    }

    public static final class b {
        public static final a1f0<String, a> a = new a1f0<>(180000, 30);

        /* JADX INFO: loaded from: classes2.dex */
        public static final class a {
            public final int a;
            public final long b;

            public a(int i, long j) {
                this.a = i;
                this.b = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.a == aVar.a && this.b == aVar.b;
            }

            public final int hashCode() {
                return Long.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                StringBuilder sbA = a0.a(CaBJCMnsV.affBdVGqDPHdgQ, ", lastUpdatedAtMillis=", this.a, this.b);
                sbA.append(")");
                return sbA.toString();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveTimerTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.displayStrategy = new wf9();
        this.w = 10;
        this.z = "";
        this.C = new eco(this, 1);
    }

    public final void g() {
        if (this.A) {
            return;
        }
        this.A = true;
        CopyOnWriteArraySet<Function0<Unit>> copyOnWriteArraySet = a.b;
        eco ecoVar = this.C;
        ecoVar.getClass();
        a.b.add(ecoVar);
        if (a.d) {
            return;
        }
        a.d = true;
        a.c.post(a.e);
    }

    public final ws7 getDisplayStrategy() {
        return this.displayStrategy;
    }

    public final void h() {
        if (this.A) {
            this.A = false;
            CopyOnWriteArraySet<Function0<Unit>> copyOnWriteArraySet = a.b;
            eco ecoVar = this.C;
            ecoVar.getClass();
            CopyOnWriteArraySet<Function0<Unit>> copyOnWriteArraySet2 = a.b;
            copyOnWriteArraySet2.remove(ecoVar);
            if (copyOnWriteArraySet2.isEmpty()) {
                a.d = false;
                a.c.removeCallbacksAndMessages(null);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.displayStrategy.b(this.w, this.y, this.z)) {
            g();
        } else {
            h();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    public final void setDisplayStrategy(ws7 ws7Var) {
        ws7Var.getClass();
        this.displayStrategy = ws7Var;
    }

    public final void setLiveTime(String eventId, String playedSeconds, String matchStatus, int status) {
        Object bVar;
        Integer intOrNull;
        eventId.getClass();
        boolean z = false;
        if (!Intrinsics.g(this.B, eventId)) {
            h();
            this.y = 0;
            this.B = eventId;
        }
        if (matchStatus == null) {
            matchStatus = "";
        }
        this.z = matchStatus;
        this.w = status;
        if (playedSeconds == null || StringsKt.U(playedSeconds)) {
            setStaticLabel(this.z);
            return;
        }
        if (this.w != 1) {
            setStaticLabel(playedSeconds + " " + this.z);
            return;
        }
        try {
            zi50.a aVar = zi50.b;
            List listSplit$default = StringsKt__StringsKt.split$default(playedSeconds, new String[]{":"}, false, 0, 6, null);
            int i = Integer.parseInt((String) listSplit$default.get(0));
            String str = (String) CollectionsKt.V(1, listSplit$default);
            bVar = Integer.valueOf((i * 60) + ((str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue()));
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (zi50.a(bVar) != null) {
            bVar = 0;
        }
        int iIntValue = ((Number) bVar).intValue();
        a1f0<String, b.a> a1f0Var = b.a;
        b.a aVarA = a1f0Var.a(eventId);
        if (aVarA != null && this.displayStrategy.b(this.w, aVarA.a, this.z)) {
            z = true;
        }
        if (this.y == 0 && aVarA != null && z) {
            iIntValue = Math.max(aVarA.a + ((int) ((System.currentTimeMillis() - aVarA.b) / 1000)), iIntValue);
        } else if (aVarA != null && iIntValue <= aVarA.a && z) {
            return;
        }
        this.y = iIntValue;
        a1f0Var.b(eventId, new b.a(iIntValue, System.currentTimeMillis()));
        int i2 = this.y;
        setText(this.displayStrategy.a(i2, this.z));
        if (this.displayStrategy.b(this.w, i2, this.z)) {
            g();
        } else {
            h();
        }
    }

    public final void setStaticLabel(String label) {
        this.B = null;
        this.w = 10;
        this.y = 0;
        this.z = "";
        h();
        setText(label);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveTimerTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LiveTimerTextView(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ LiveTimerTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.textViewStyle);
    }
}
