package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.sportybet.android.gp.tz.R;
import defpackage.ar0;
import defpackage.cr0;
import defpackage.cyf0;
import defpackage.fr0;
import defpackage.gq0;
import defpackage.ir0;
import defpackage.jr0;
import defpackage.nof0;
import defpackage.qmf0;
import defpackage.r6i0;
import defpackage.rza;
import defpackage.smf0;
import defpackage.tln;
import defpackage.uln;
import defpackage.vln;
import defpackage.wvf;
import defpackage.xoy;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements xoy {
    public final gq0 a;
    public final jr0 b;
    public final ir0 c;
    public final smf0 d;
    public final ar0 e;
    public a f;

    public class a {
        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        cyf0.a(context);
        nof0.a(this, getContext());
        gq0 gq0Var = new gq0(this);
        this.a = gq0Var;
        gq0Var.d(attributeSet, i);
        jr0 jr0Var = new jr0(this);
        this.b = jr0Var;
        jr0Var.f(attributeSet, i);
        jr0Var.b();
        ir0 ir0Var = new ir0();
        ir0Var.a = this;
        this.c = ir0Var;
        this.d = new smf0();
        ar0 ar0Var = new ar0(this);
        this.e = ar0Var;
        ar0Var.b(attributeSet, i);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean zIsFocusable = super.isFocusable();
        boolean zIsClickable = super.isClickable();
        boolean zIsLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener keyListenerA = ar0Var.a(keyListener);
        if (keyListenerA == keyListener) {
            return;
        }
        super.setKeyListener(keyListenerA);
        super.setRawInputType(inputType);
        super.setFocusable(zIsFocusable);
        super.setClickable(zIsClickable);
        super.setLongClickable(zIsLongClickable);
    }

    private a getSuperCaller() {
        a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a();
        this.f = aVar2;
        return aVar2;
    }

    @Override // defpackage.xoy
    public final rza a(rza rzaVar) {
        return this.d.a(this, rzaVar);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.a();
        }
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return qmf0.e(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            return gq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            return gq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        ir0 ir0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ir0Var = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = ir0Var.b;
        return textClassifier == null ? ir0.a.a(ir0Var.a) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrH;
        InputConnection vlnVar;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && inputConnectionOnCreateInputConnection != null) {
            wvf.c(editorInfo, getText());
        }
        cr0.d(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionOnCreateInputConnection != null && i <= 30 && (strArrH = r6i0.h(this)) != null) {
            wvf.b(editorInfo, strArrH);
            tln tlnVar = new tln(this);
            if (i >= 25) {
                vlnVar = new uln(inputConnectionOnCreateInputConnection, tlnVar);
            } else if (wvf.a(editorInfo).length != 0) {
                vlnVar = new vln(inputConnectionOnCreateInputConnection, tlnVar);
            }
            inputConnectionOnCreateInputConnection = vlnVar;
        }
        return this.e.c(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean zA = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && r6i0.h(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                zA = fr0.a(dragEvent, this, activity);
            }
        }
        if (zA) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        rza.c cVar;
        rza.b bVar;
        int i2;
        rza.a aVar;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31 || r6i0.h(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i3 >= 31) {
                aVar = new rza.a(primaryClip, 1);
            } else {
                cVar = new rza.c();
                cVar.a = primaryClip;
                cVar.b = 1;
            }
            if (i == 16908322) {
                bVar = cVar;
                bVar = aVar;
                i2 = 0;
            } else {
                bVar = cVar;
                bVar = aVar;
                i2 = 1;
            }
            bVar.b(i2);
            r6i0.l(this, bVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(qmf0.f(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        gq0 gq0Var = this.a;
        if (gq0Var != null) {
            gq0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        jr0 jr0Var = this.b;
        jr0Var.k(colorStateList);
        jr0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        jr0 jr0Var = this.b;
        jr0Var.l(mode);
        jr0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        jr0 jr0Var = this.b;
        if (jr0Var != null) {
            jr0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        ir0 ir0Var;
        if (Build.VERSION.SDK_INT >= 28 || (ir0Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            ir0Var.b = textClassifier;
        }
    }

    public AppCompatEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    public AppCompatEditText(Context context) {
        this(context, null);
    }
}
