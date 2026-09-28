package com.sportygames.pingpong.components;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.sportygames.pingpong.components.SHKeypadContainer;
import defpackage.dd20;
import defpackage.moa0;
import defpackage.op5;
import defpackage.rn60;
import defpackage.tc20;
import defpackage.tk30;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u001b\u0010\u0012\u001a\u00020\b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u0012\u0010\u000eJ\u001b\u0010\u0014\u001a\u00020\b2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u0014\u0010\u000eJ\u001b\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\u0016\u0010\u000eJ!\u0010\u001a\u001a\u00020\b2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\b0\u0017¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/sportygames/pingpong/components/SHKeypadContainer;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "setFontSizeCms", "()V", "Lkotlin/Function0;", "doubleZeroListener", "setDoubleZeroClick", "(Lkotlin/jvm/functions/Function0;)V", "pointListener", "setPointClick", "clearListener", "setClearClick", "crossListener", "setCrossClick", "doneListener", "setDoneClick", "Lkotlin/Function1;", "", "numberListener", "setNumberClick", "(Lkotlin/jvm/functions/Function1;)V", "Lmoa0;", "E", "Lmoa0;", "getBinding", "()Lmoa0;", "setBinding", "(Lmoa0;)V", "binding", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SHKeypadContainer extends LinearLayoutCompat {
    public static final /* synthetic */ int F = 0;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    public moa0 binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SHKeypadContainer(Context context, AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        context.getClass();
        this.binding = moa0.a(LayoutInflater.from(context), this);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.k);
            typedArrayObtainStyledAttributes.getClass();
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final moa0 getBinding() {
        return this.binding;
    }

    public final void setBinding(moa0 moa0Var) {
        moa0Var.getClass();
        this.binding = moa0Var;
    }

    public final void setClearClick(final Function0<Unit> clearListener) {
        clearListener.getClass();
        this.binding.b.setOnClickListener(new View.OnClickListener() { // from class: zm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                clearListener.invoke();
            }
        });
    }

    public final void setCrossClick(final Function0<Unit> crossListener) {
        crossListener.getClass();
        this.binding.c.setOnClickListener(new View.OnClickListener() { // from class: dn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                crossListener.invoke();
            }
        });
    }

    public final void setDoneClick(final Function0<Unit> doneListener) {
        doneListener.getClass();
        this.binding.d.setOnClickListener(new View.OnClickListener() { // from class: um60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                doneListener.invoke();
            }
        });
    }

    public final void setDoubleZeroClick(final Function0<Unit> doubleZeroListener) {
        doubleZeroListener.getClass();
        this.binding.e.setOnClickListener(new View.OnClickListener() { // from class: en60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                doubleZeroListener.invoke();
            }
        });
    }

    public final void setFontSizeCms() {
        if (op5.c(op5.a, this.binding.d.getTag().toString(), this.binding.d.getText().toString()).length() > 7) {
            this.binding.d.setPadding(0, 20, 0, 0);
            this.binding.d.setTextSize(2, 12.0f);
        }
    }

    public final void setNumberClick(final Function1<? super Integer, Unit> numberListener) {
        numberListener.getClass();
        this.binding.y.setOnClickListener(new View.OnClickListener() { // from class: gn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                numberListener.invoke(1);
            }
        });
        this.binding.D.setOnClickListener(new tc20(numberListener, 1));
        this.binding.C.setOnClickListener(new View.OnClickListener() { // from class: jn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                numberListener.invoke(3);
            }
        });
        this.binding.i.setOnClickListener(new View.OnClickListener() { // from class: ln60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                numberListener.invoke(5);
            }
        });
        this.binding.v.setOnClickListener(new View.OnClickListener() { // from class: nn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                numberListener.invoke(4);
            }
        });
        this.binding.B.setOnClickListener(new View.OnClickListener() { // from class: pn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                numberListener.invoke(6);
            }
        });
        this.binding.A.setOnClickListener(new rn60(numberListener, 0));
        this.binding.f.setOnClickListener(new dd20(numberListener, 1));
        this.binding.w.setOnClickListener(new View.OnClickListener() { // from class: wm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                numberListener.invoke(9);
            }
        });
        this.binding.E.setOnClickListener(new View.OnClickListener() { // from class: xm60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                numberListener.invoke(0);
            }
        });
    }

    public final void setPointClick(final Function0<Unit> pointListener) {
        pointListener.getClass();
        this.binding.z.setOnClickListener(new View.OnClickListener() { // from class: bn60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i = SHKeypadContainer.F;
                pointListener.invoke();
            }
        });
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SHKeypadContainer(Context context) {
        this(context, null);
        context.getClass();
    }
}
