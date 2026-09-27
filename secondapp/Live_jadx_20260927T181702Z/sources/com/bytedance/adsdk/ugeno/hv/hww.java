package com.bytedance.adsdk.ugeno.hv;

import android.view.View;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
interface hww {
    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<sd> getFlexLinesInternal();

    int getFlexWrap();

    int getLargestMainSize();

    int getMaxLine();

    int getPaddingBottom();

    int getPaddingEnd();

    int getPaddingLeft();

    int getPaddingRight();

    int getPaddingStart();

    int getPaddingTop();

    int getSumOfCrossSize();

    int hww(int i10, int i11, int i12);

    int hww(View view);

    int hww(View view, int i10, int i11);

    View hww(int i10);

    void hww(View view, int i10, int i11, sd sdVar);

    void hww(sd sdVar);

    boolean hww();

    void setFlexLines(List<sd> list);

    int tq(int i10, int i11, int i12);

    View tq(int i10);
}
