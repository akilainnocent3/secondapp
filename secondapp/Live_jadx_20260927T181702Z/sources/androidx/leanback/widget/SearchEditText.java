package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class SearchEditText extends z2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f12208r = "SearchEditText";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f12209s = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f12210q;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b bVar = SearchEditText.this.f12210q;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        void a();
    }

    public SearchEditText(Context context) {
        this(context, null);
    }

    @Override // androidx.leanback.widget.z2
    public /* bridge */ /* synthetic */ void f() {
        super.f();
    }

    @Override // androidx.leanback.widget.z2
    public /* bridge */ /* synthetic */ void h(String str, String str2) {
        super.h(str, str2);
    }

    @Override // androidx.leanback.widget.z2
    public /* bridge */ /* synthetic */ void i(String str, List list) {
        super.i(str, list);
    }

    @Override // androidx.leanback.widget.z2, android.view.View
    public /* bridge */ /* synthetic */ void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int i10, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && this.f12210q != null) {
            post(new a());
        }
        return super.onKeyPreIme(i10, keyEvent);
    }

    @Override // androidx.leanback.widget.z2, android.widget.TextView
    public /* bridge */ /* synthetic */ void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    @Override // androidx.leanback.widget.z2
    public /* bridge */ /* synthetic */ void setFinalRecognizedText(CharSequence charSequence) {
        super.setFinalRecognizedText(charSequence);
    }

    public void setOnKeyboardDismissListener(b bVar) {
        this.f12210q = bVar;
    }

    public SearchEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, s3.a.m.f128948w);
    }

    public SearchEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
