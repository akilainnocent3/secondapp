package defpackage;

import android.view.View;
import com.google.android.flexbox.a;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface avh {
    void c(View view, int i, int i2, a aVar);

    int e(int i, int i2, int i3);

    View f(int i);

    int g(int i, int i2, int i3);

    int getAlignContent();

    int getAlignItems();

    int getFlexDirection();

    int getFlexItemCount();

    List<a> getFlexLinesInternal();

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

    int i(View view);

    void j(a aVar);

    View k(int i);

    void l(int i, View view);

    int m(View view, int i, int i2);

    boolean o();

    void setFlexLines(List<a> list);
}
