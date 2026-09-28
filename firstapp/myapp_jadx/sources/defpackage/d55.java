package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.material.bottomsheet.b;

/* JADX INFO: loaded from: classes4.dex */
public final class d55 implements View.OnClickListener {
    public final /* synthetic */ b a;

    public d55(b bVar) {
        this.a = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        b bVar = this.a;
        if (bVar.y && bVar.isShowing()) {
            if (!bVar.A) {
                TypedArray typedArrayObtainStyledAttributes = bVar.getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
                bVar.z = typedArrayObtainStyledAttributes.getBoolean(0, true);
                typedArrayObtainStyledAttributes.recycle();
                bVar.A = true;
            }
            if (bVar.z) {
                bVar.cancel();
            }
        }
    }
}
