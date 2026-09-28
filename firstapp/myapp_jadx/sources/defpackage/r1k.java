package defpackage;

import android.R;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\"\u0010!\u001a\u00020 8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010+\u001a\u0012\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)0'j\u0002`*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u0004\u0018\u00010-8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lr1k;", "Lfq0;", "<init>", "()V", "", "registerLegacyBackPressBridge", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "onBackPressedCompat", "()Z", "onStart", "Landroid/view/MotionEvent;", AnalyticsEvent.BI_TRACKING_KIND_EVENT, "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Ly8j;", "fullStoryCommonManager", "Ly8j;", "getFullStoryCommonManager", "()Ly8j;", "setFullStoryCommonManager", "(Ly8j;)V", "Lg9j;", "fullStoryFragmentManager", "Lg9j;", "getFullStoryFragmentManager", "()Lg9j;", "setFullStoryFragmentManager", "(Lg9j;)V", "Ljch0;", "uiInteractionObserver", "Ljch0;", "getUiInteractionObserver", "()Ljch0;", "setUiInteractionObserver", "(Ljch0;)V", "Ljava/util/HashMap;", "Landroidx/fragment/app/Fragment;", "", "Lcom/sportybet/android/fullstory/PageRecord;", "record", "Ljava/util/HashMap;", "Landroid/view/ViewGroup;", "getContentView", "()Landroid/view/ViewGroup;", "contentView", "common"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class r1k extends hrl {
    public static final int $stable = 8;
    public y8j fullStoryCommonManager;
    public g9j fullStoryFragmentManager;
    private final HashMap<Fragment, Object> record = new HashMap<>();
    public jch0 uiInteractionObserver;

    public static final class a extends cny {
        public a() {
            super(true);
        }

        @Override // defpackage.cny
        public final void b() {
            r1k r1kVar = r1k.this;
            if (r1kVar.onBackPressedCompat()) {
                return;
            }
            f(false);
            r1kVar.getOnBackPressedDispatcher().d();
            f(true);
        }
    }

    private final void registerLegacyBackPressBridge() {
        getOnBackPressedDispatcher().a(this, new a());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent event) {
        event.getClass();
        long jNanoTime = System.nanoTime();
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(event);
        try {
            zi50.a aVar = zi50.b;
            getUiInteractionObserver().a(this, event, zDispatchTouchEvent, jNanoTime);
            Unit unit = Unit.a;
            return zDispatchTouchEvent;
        } catch (Throwable unused) {
            zi50.a aVar2 = zi50.b;
            return zDispatchTouchEvent;
        }
    }

    public final ViewGroup getContentView() {
        return (ViewGroup) findViewById(R.id.content);
    }

    public final y8j getFullStoryCommonManager() {
        y8j y8jVar = this.fullStoryCommonManager;
        if (y8jVar != null) {
            return y8jVar;
        }
        Intrinsics.n("fullStoryCommonManager");
        throw null;
    }

    public final g9j getFullStoryFragmentManager() {
        g9j g9jVar = this.fullStoryFragmentManager;
        if (g9jVar != null) {
            return g9jVar;
        }
        Intrinsics.n("fullStoryFragmentManager");
        throw null;
    }

    public final jch0 getUiInteractionObserver() {
        jch0 jch0Var = this.uiInteractionObserver;
        if (jch0Var != null) {
            return jch0Var;
        }
        Intrinsics.n("uiInteractionObserver");
        throw null;
    }

    public boolean onBackPressedCompat() {
        return false;
    }

    @Override // defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        g9j fullStoryFragmentManager = getFullStoryFragmentManager();
        HashMap<Fragment, Object> map = this.record;
        fullStoryFragmentManager.getClass();
        map.getClass();
        fullStoryFragmentManager.a.getClass();
        registerLegacyBackPressBridge();
    }

    @Override // defpackage.fq0, androidx.fragment.app.e, android.app.Activity
    public void onStart() {
        ViewGroup contentView;
        super.onStart();
        getFullStoryCommonManager().getClass();
        if (!(this instanceof k9j) || (contentView = getContentView()) == null) {
            return;
        }
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_FULL_STORY);
        aVar.a("unmask activity: " + this, new Object[0]);
        getFullStoryCommonManager().d(contentView, "fs-unmask");
    }

    public final void setFullStoryCommonManager(y8j y8jVar) {
        y8jVar.getClass();
        this.fullStoryCommonManager = y8jVar;
    }

    public final void setFullStoryFragmentManager(g9j g9jVar) {
        g9jVar.getClass();
        this.fullStoryFragmentManager = g9jVar;
    }

    public final void setUiInteractionObserver(jch0 jch0Var) {
        jch0Var.getClass();
        this.uiInteractionObserver = jch0Var;
    }
}
