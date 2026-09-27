package yads;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.view.View;
import android.widget.ProgressBar;
import com.yandex.div.core.DivCustomContainerViewAdapter;
import com.yandex.div.core.DivPreloader;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class dh0 implements DivCustomContainerViewAdapter {
    public static Integer a(mq.f7 f7Var, String str) {
        Object objB;
        JSONObject jSONObject = f7Var.f109071i;
        String strOptString = jSONObject != null ? jSONObject.optString(str) : null;
        try {
            dr.i1.a aVar = dr.i1.f79460c;
            objB = dr.i1.b(Integer.valueOf(Color.parseColor(strOptString)));
        } catch (Throwable th2) {
            dr.i1.a aVar2 = dr.i1.f79460c;
            objB = dr.i1.b(dr.j1.a(th2));
        }
        return (Integer) (dr.i1.i(objB) ? null : objB);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final View createView(mq.f7 f7Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
        ProgressBar progressBar = new ProgressBar(div2View.getContext(), null, R.attr.progressBarStyleHorizontal);
        Integer numA = a(f7Var, "progress_color");
        if (numA != null) {
            progressBar.setProgressTintList(ColorStateList.valueOf(numA.intValue()));
        }
        Integer numA2 = a(f7Var, "background_color");
        if (numA2 != null) {
            progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(numA2.intValue()));
        }
        return progressBar;
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public /* synthetic */ DivPreloader.PreloadReference preload(mq.f7 f7Var, DivPreloader.Callback callback) {
        return com.yandex.div.core.e.a(this, f7Var, callback);
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void release(View view, mq.f7 f7Var) {
    }

    @Override // com.yandex.div.core.DivCustomContainerViewAdapter
    public final void bindView(View view, mq.f7 f7Var, Div2View div2View, ExpressionResolver expressionResolver, DivStatePath divStatePath) {
    }
}
