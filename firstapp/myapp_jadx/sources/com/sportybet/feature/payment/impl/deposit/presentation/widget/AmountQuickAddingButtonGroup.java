package com.sportybet.feature.payment.impl.deposit.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.deposit.presentation.widget.AmountQuickAddingButtonGroup;
import defpackage.bmy;
import defpackage.h5e;
import defpackage.j7g;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000fR(\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/sportybet/feature/payment/impl/deposit/presentation/widget/AmountQuickAddingButtonGroup;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "callback", "setupOnClickListener", "(Lkotlin/jvm/functions/Function1;)V", "", "Landroid/widget/Button;", "F", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "setButtons", "(Ljava/util/List;)V", "buttons", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class AmountQuickAddingButtonGroup extends ConstraintLayout {
    public static final /* synthetic */ int G = 0;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public List<? extends Button> buttons;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmountQuickAddingButtonGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.layout_deposit_amount_quick_adding_buttons_group, this);
        int i2 = R.id.adding_button_01;
        Button button = (Button) h5e.a(R.id.adding_button_01, this);
        if (button != null) {
            i2 = R.id.adding_button_02;
            Button button2 = (Button) h5e.a(R.id.adding_button_02, this);
            if (button2 != null) {
                i2 = R.id.adding_button_03;
                Button button3 = (Button) h5e.a(R.id.adding_button_03, this);
                if (button3 != null) {
                    i2 = R.id.adding_button_04;
                    Button button4 = (Button) h5e.a(R.id.adding_button_04, this);
                    if (button4 != null) {
                        i2 = R.id.adding_button_05;
                        Button button5 = (Button) h5e.a(R.id.adding_button_05, this);
                        if (button5 != null) {
                            setButtons(b.k(button, button2, button3, button4, button5));
                            return;
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    public final void E(List list) {
        list.getClass();
        if (this.buttons != null && getButtons().size() == list.size()) {
            int i = 0;
            for (Object obj : getButtons()) {
                int i2 = i + 1;
                if (i < 0) {
                    b.q();
                    throw null;
                }
                Button button = (Button) obj;
                j7g j7gVar = new j7g();
                j7gVar.a("+");
                j7gVar.a(((BigDecimal) list.get(i)).toString());
                button.setText(j7gVar);
                button.setTag(list.get(i));
                button.setContentDescription(getContext().getString(R.string.deposit_preset_input));
                i = i2;
            }
        }
    }

    public final List<Button> getButtons() {
        List list = this.buttons;
        if (list != null) {
            return list;
        }
        Intrinsics.n("buttons");
        throw null;
    }

    public final void setButtons(List<? extends Button> list) {
        list.getClass();
        this.buttons = list;
    }

    public final void setupOnClickListener(final Function1<? super BigDecimal, Unit> callback) {
        callback.getClass();
        if (this.buttons == null) {
            return;
        }
        Iterator<T> it = getButtons().iterator();
        while (it.hasNext()) {
            ((Button) it.next()).setOnClickListener(new View.OnClickListener() { // from class: tw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i = AmountQuickAddingButtonGroup.G;
                    Object tag = view.getTag();
                    BigDecimal bigDecimal = tag instanceof BigDecimal ? (BigDecimal) tag : null;
                    if (bigDecimal != null) {
                        callback.invoke(bigDecimal);
                    }
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountQuickAddingButtonGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AmountQuickAddingButtonGroup(Context context) {
        this(context, null, 6, 0);
        context.getClass();
    }

    public /* synthetic */ AmountQuickAddingButtonGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
