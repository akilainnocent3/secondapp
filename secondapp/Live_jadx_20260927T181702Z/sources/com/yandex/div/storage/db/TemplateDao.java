package com.yandex.div.storage.db;

import com.yandex.div.storage.entity.Template;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface TemplateDao {
    void deleteAllTemplates();

    void deleteUnusedTemplates();

    @l
    List<Template> getAllTemplates();

    @l
    List<Template> getTemplates(@l String str);

    @l
    List<Template> getTemplatesByIds(@l List<String> list);

    void insertTemplate(@l Template template);
}
