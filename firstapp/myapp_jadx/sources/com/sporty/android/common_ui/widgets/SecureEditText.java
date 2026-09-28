package com.sporty.android.common_ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.widget.AppCompatEditText;
import com.sportybet.android.gp.tz.R;
import defpackage.hwr;
import defpackage.k380;
import defpackage.mpe0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/common_ui/widgets/SecureEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "i", "Lttr;", "getDisableMenuId", "()Ljava/util/List;", "disableMenuId", "", "v", "Z", "getCanCopy", "()Z", "setCanCopy", "(Z)V", "canCopy", "common-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class SecureEditText extends AppCompatEditText {
    public static final /* synthetic */ int w = 0;
    public final mpe0 i;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public boolean canCopy;

    public static final class a implements ActionMode.Callback {
        public a() {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public final void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            SecureEditText secureEditText = SecureEditText.this;
            if (secureEditText.getCanCopy()) {
                return true;
            }
            Iterator it = secureEditText.getDisableMenuId().iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (menu != null) {
                    menu.removeItem(iIntValue);
                }
            }
            return true;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecureEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.i = hwr.b(new k380());
        this.canCopy = true;
        setCustomSelectionActionModeCallback(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Integer> getDisableMenuId() {
        return (List) this.i.getValue();
    }

    public final boolean getCanCopy() {
        return this.canCopy;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (this.canCopy || !getDisableMenuId().contains(Integer.valueOf(i))) {
            return super.onTextContextMenuItem(i);
        }
        return false;
    }

    public final void setCanCopy(boolean z) {
        this.canCopy = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SecureEditText(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ SecureEditText(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, R.attr.editTextStyle);
    }
}
