package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.impl.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class FullUrlFormer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f98923a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f98924b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f98925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final IParamsAppender f98926d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ConfigProvider f98927e;

    public FullUrlFormer(@NonNull IParamsAppender<T> iParamsAppender, @NonNull ConfigProvider<T> configProvider) {
        this.f98926d = iParamsAppender;
        this.f98927e = configProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void buildAndSetFullHostUrl() {
        Uri.Builder builderBuildUpon = Uri.parse((String) this.f98923a.get(this.f98924b)).buildUpon();
        this.f98926d.appendParams(builderBuildUpon, this.f98927e.getConfig());
        this.f98925c = builderBuildUpon.build().toString();
    }

    @Nullable
    public List<String> getAllHosts() {
        return this.f98923a;
    }

    @Nullable
    public String getUrl() {
        return new c(this.f98925c).f98898a;
    }

    public boolean hasMoreHosts() {
        return this.f98924b + 1 < this.f98923a.size();
    }

    public void incrementAttemptNumber() {
        this.f98924b++;
    }

    public void setHosts(@Nullable List<String> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f98923a = list;
    }
}
