package yads;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.yandex.mobile.ads.R;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c53 extends ea0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ds.p f147579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Switch f147580b;

    public c53(View view, rk3 rk3Var) {
        super(view);
        this.f147579a = rk3Var;
        this.f147580b = (Switch) view.findViewById(R.id.item_switch);
    }

    @Override // yads.ea0
    public final void a(final aa0 aa0Var) {
        this.f147580b.setOnCheckedChangeListener(null);
        Switch r10 = this.f147580b;
        aa0Var.getClass();
        r10.setText("Debug Error Indicator");
        this.f147580b.setChecked(aa0Var.f146711a);
        this.f147580b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: yads.jy3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                c53.a(this.f151311a, aa0Var, compoundButton, z10);
            }
        });
    }

    public static final void a(c53 c53Var, aa0 aa0Var, CompoundButton compoundButton, boolean z10) {
        ds.p pVar = c53Var.f147579a;
        aa0Var.getClass();
        pVar.invoke(z90.DEBUG_ERROR_INDICATOR, Boolean.valueOf(z10));
    }
}
