package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes.dex */
public final class znh extends androidx.fragment.app.d {
    public final Handler a = new Handler(Looper.getMainLooper());
    public final a b = new a();
    public vd4 c;
    public int d;
    public int e;
    public ImageView f;
    public TextView i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            znh znhVar = znh.this;
            Context context = znhVar.getContext();
            if (context == null) {
                Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
                return;
            }
            znhVar.c.y1(1);
            vd4 vd4Var = znhVar.c;
            String string = context.getString(R.string.fingerprint_dialog_touch_sensor);
            ssw<CharSequence> sswVar = vd4Var.N;
            if (sswVar == null) {
                sswVar = new ssw<>();
                vd4Var.N = sswVar;
            }
            vd4.A1(sswVar, string);
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            znh.this.c.z1(true);
        }
    }

    public static class c {
        public static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    public static class d {
        public static int a() {
            return R.attr.colorError;
        }
    }

    public final int j0(int i) {
        Context context = getContext();
        if (context == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(typedValue.data, new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        vd4 vd4Var = this.c;
        ssw<Boolean> sswVar = vd4Var.K;
        if (sswVar == null) {
            sswVar = new ssw<>();
            vd4Var.K = sswVar;
        }
        vd4.A1(sswVar, Boolean.TRUE);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vd4 vd4VarA = qd4.a(this, getArguments().getBoolean("host_activity", true));
        this.c = vd4VarA;
        ssw<Integer> sswVar = vd4VarA.M;
        if (sswVar == null) {
            sswVar = new ssw<>();
            vd4VarA.M = sswVar;
        }
        sswVar.f(this, new aoh(this));
        vd4 vd4Var = this.c;
        ssw<CharSequence> sswVar2 = vd4Var.N;
        if (sswVar2 == null) {
            sswVar2 = new ssw<>();
            vd4Var.N = sswVar2;
        }
        sswVar2.f(this, new boh(this));
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = j0(d.a());
        } else {
            Context context = getContext();
            this.d = context != null ? context.getColor(R.color.biometric_error_color) : 0;
        }
        this.e = j0(android.R.attr.textColorSecondary);
    }

    @Override // androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(requireContext());
        qd4.d dVar = this.c.c;
        String string = null;
        aVar.setTitle(dVar != null ? dVar.a : null);
        View viewInflate = LayoutInflater.from(aVar.getContext()).inflate(R.layout.fingerprint_dialog_layout, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(R.id.fingerprint_subtitle);
        if (textView != null) {
            qd4.d dVar2 = this.c.c;
            CharSequence charSequence = dVar2 != null ? dVar2.b : null;
            if (TextUtils.isEmpty(charSequence)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(charSequence);
            }
        }
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.fingerprint_description);
        if (textView2 != null) {
            this.c.getClass();
            if (TextUtils.isEmpty(null)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText((CharSequence) null);
            }
        }
        this.f = (ImageView) viewInflate.findViewById(R.id.fingerprint_icon);
        this.i = (TextView) viewInflate.findViewById(R.id.fingerprint_error);
        if (w41.b(this.c.x1())) {
            string = getString(R.string.confirm_device_credential_password);
        } else {
            vd4 vd4Var = this.c;
            String str = vd4Var.v;
            if (str != null) {
                string = str;
            } else {
                qd4.d dVar3 = vd4Var.c;
                if (dVar3 != null) {
                    string = dVar3.c;
                }
            }
        }
        aVar.b(string, new b());
        aVar.setView(viewInflate);
        androidx.appcompat.app.b bVarCreate = aVar.create();
        bVarCreate.setCanceledOnTouchOutside(false);
        return bVarCreate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.a.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        vd4 vd4Var = this.c;
        vd4Var.L = 0;
        vd4Var.y1(1);
        vd4 vd4Var2 = this.c;
        String string = getString(R.string.fingerprint_dialog_touch_sensor);
        ssw<CharSequence> sswVar = vd4Var2.N;
        if (sswVar == null) {
            sswVar = new ssw<>();
            vd4Var2.N = sswVar;
        }
        vd4.A1(sswVar, string);
    }
}
