package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.a;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class swz extends f6g {
    public final int e;
    public EditText f;
    public final rwz g;

    /* JADX WARN: Type inference failed for: r1v2, types: [rwz] */
    public swz(a aVar, int i) {
        super(aVar);
        this.e = R.drawable.design_password_eye;
        this.g = new View.OnClickListener() { // from class: rwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                swz swzVar = this.a;
                EditText editText = swzVar.f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = swzVar.f;
                boolean z = editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText3 = swzVar.f;
                if (z) {
                    editText3.setTransformationMethod(null);
                } else {
                    editText3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    swzVar.f.setSelection(selectionEnd);
                }
                swzVar.p();
            }
        };
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.f6g
    public final void b() {
        p();
    }

    @Override // defpackage.f6g
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.f6g
    public final int d() {
        return this.e;
    }

    @Override // defpackage.f6g
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.f6g
    public final boolean j() {
        return true;
    }

    @Override // defpackage.f6g
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.f6g
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.f6g
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.f6g
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
