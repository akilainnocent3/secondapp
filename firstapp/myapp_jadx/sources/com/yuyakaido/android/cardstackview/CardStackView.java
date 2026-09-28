package com.yuyakaido.android.cardstackview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ah6;
import defpackage.dh6;
import defpackage.eh6;
import defpackage.hb5;
import defpackage.yg6;

/* JADX INFO: loaded from: classes7.dex */
public class CardStackView extends RecyclerView {
    public final yg6 b1;

    public CardStackView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b1 = new yg6(this);
        dh6 dh6Var = new dh6();
        dh6Var.d = 0;
        dh6Var.e = 0;
        dh6Var.a(this);
        setOverScrollMode(2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        CardStackLayoutManager cardStackLayoutManager;
        View viewF;
        if (motionEvent.getAction() == 0 && (cardStackLayoutManager = (CardStackLayoutManager) getLayoutManager()) != null) {
            motionEvent.getX();
            float y = motionEvent.getY();
            eh6 eh6Var = cardStackLayoutManager.H;
            if (eh6Var.f < cardStackLayoutManager.a() && (viewF = cardStackLayoutManager.F(eh6Var.f)) != null) {
                float f = cardStackLayoutManager.D / 2.0f;
                eh6Var.h = (-((y - f) - viewF.getTop())) / f;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.f fVar) {
        if (getLayoutManager() == null) {
            setLayoutManager(new CardStackLayoutManager(getContext(), ah6.h));
        }
        RecyclerView.f adapter = getAdapter();
        yg6 yg6Var = this.b1;
        if (adapter != null) {
            getAdapter().unregisterAdapterDataObserver(yg6Var);
            getAdapter().onDetachedFromRecyclerView(this);
        }
        fVar.registerAdapterDataObserver(yg6Var);
        super.setAdapter(fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(RecyclerView.o oVar) {
        if (oVar instanceof CardStackLayoutManager) {
            super.setLayoutManager(oVar);
        } else {
            hb5.a("CardStackView must be set CardStackLayoutManager.");
        }
    }

    public CardStackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardStackView(Context context) {
        this(context, null);
    }
}
