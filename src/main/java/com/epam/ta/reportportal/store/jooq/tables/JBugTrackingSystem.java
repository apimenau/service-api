/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables;

import com.epam.ta.reportportal.store.jooq.Indexes;
import com.epam.ta.reportportal.store.jooq.JPublic;
import com.epam.ta.reportportal.store.jooq.Keys;
import com.epam.ta.reportportal.store.jooq.enums.JBtsTypeEnum;
import com.epam.ta.reportportal.store.jooq.tables.records.JBugTrackingSystemRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.util.Arrays;
import java.util.List;


/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.5" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JBugTrackingSystem extends TableImpl<JBugTrackingSystemRecord> {

	private static final long serialVersionUID = -978456412;

	/**
	 * The reference instance of <code>public.bug_tracking_system</code>
	 */
	public static final JBugTrackingSystem BUG_TRACKING_SYSTEM = new JBugTrackingSystem();

	/**
	 * The class holding records for this type
	 */
	@Override
	public Class<JBugTrackingSystemRecord> getRecordType() {
		return JBugTrackingSystemRecord.class;
	}

	/**
	 * The column <code>public.bug_tracking_system.id</code>.
	 */
	public final TableField<JBugTrackingSystemRecord, Integer> ID = createField(
			"id", org.jooq.impl.SQLDataType.INTEGER.nullable(false)
					.defaultValue(
							org.jooq.impl.DSL.field("nextval('bug_tracking_system_id_seq'::regclass)", org.jooq.impl.SQLDataType.INTEGER)),
			this, ""
	);

	/**
	 * The column <code>public.bug_tracking_system.url</code>.
	 */
	public final TableField<JBugTrackingSystemRecord, String> URL = createField(
			"url", org.jooq.impl.SQLDataType.VARCHAR.nullable(false), this, "");

	/**
	 * The column <code>public.bug_tracking_system.type</code>.
	 */
	public final TableField<JBugTrackingSystemRecord, JBtsTypeEnum> TYPE = createField(
			"type",
			org.jooq.util.postgres.PostgresDataType.VARCHAR.asEnumDataType(com.epam.ta.reportportal.store.jooq.enums.JBtsTypeEnum.class),
			this, ""
	);

	/**
	 * Create a <code>public.bug_tracking_system</code> table reference
	 */
	public JBugTrackingSystem() {
		this(DSL.name("bug_tracking_system"), null);
	}

	/**
	 * Create an aliased <code>public.bug_tracking_system</code> table reference
	 */
	public JBugTrackingSystem(String alias) {
		this(DSL.name(alias), BUG_TRACKING_SYSTEM);
	}

	/**
	 * Create an aliased <code>public.bug_tracking_system</code> table reference
	 */
	public JBugTrackingSystem(Name alias) {
		this(alias, BUG_TRACKING_SYSTEM);
	}

	private JBugTrackingSystem(Name alias, Table<JBugTrackingSystemRecord> aliased) {
		this(alias, aliased, null);
	}

	private JBugTrackingSystem(Name alias, Table<JBugTrackingSystemRecord> aliased, Field<?>[] parameters) {
		super(alias, null, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Schema getSchema() {
		return JPublic.PUBLIC;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<Index> getIndexes() {
		return Arrays.<Index>asList(Indexes.BUG_TRACKING_SYSTEM_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Identity<JBugTrackingSystemRecord, Integer> getIdentity() {
		return Keys.IDENTITY_BUG_TRACKING_SYSTEM;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UniqueKey<JBugTrackingSystemRecord> getPrimaryKey() {
		return Keys.BUG_TRACKING_SYSTEM_PK;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<UniqueKey<JBugTrackingSystemRecord>> getKeys() {
		return Arrays.<UniqueKey<JBugTrackingSystemRecord>>asList(Keys.BUG_TRACKING_SYSTEM_PK);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JBugTrackingSystem as(String alias) {
		return new JBugTrackingSystem(DSL.name(alias), this);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JBugTrackingSystem as(Name alias) {
		return new JBugTrackingSystem(alias, this);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JBugTrackingSystem rename(String name) {
		return new JBugTrackingSystem(DSL.name(name), null);
	}

	/**
	 * Rename this table
	 */
	@Override
	public JBugTrackingSystem rename(Name name) {
		return new JBugTrackingSystem(name, null);
	}
}